package au.gov.nehta.schema;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

/**
 * JAXB adapter for schema {@code xs:date} values as {@link Calendar}.
 */
public class DateAdapter extends XmlAdapter<String, Calendar> {

    private static final DateTimeFormatter ISO_DATE = DateTimeFormatter.ISO_LOCAL_DATE;

    @Override
    public Calendar unmarshal(String value) {
        if (value == null || value.isBlank()) {
            return null;
        }
        try {
            return DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(value)
                    .toGregorianCalendar();
        } catch (DatatypeConfigurationException | IllegalArgumentException ex) {
            // Fallback for date-only literals when the full lexical form is rejected.
            try {
                LocalDate date = LocalDate.parse(value.length() >= 10 ? value.substring(0, 10) : value, ISO_DATE);
                return GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
            } catch (DateTimeException fallback) {
                throw new IllegalArgumentException("Invalid date: " + value, ex);
            }
        }
    }

    @Override
    public String marshal(Calendar value) {
        if (value == null) {
            return null;
        }
        return Instant.ofEpochMilli(value.getTimeInMillis())
                .atZone(value.getTimeZone().toZoneId())
                .toLocalDate()
                .format(ISO_DATE);
    }
}
