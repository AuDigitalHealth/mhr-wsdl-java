
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="recordStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Verified"/&gt;
 *     &lt;enumeration value="Unverified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "recordStatusType")
@XmlEnum
public enum RecordStatusType {

    @XmlEnumValue("Verified")
    VERIFIED("Verified"),
    @XmlEnumValue("Unverified")
    UNVERIFIED("Unverified");
    private final String value;

    RecordStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordStatusType fromValue(String v) {
        for (RecordStatusType c: RecordStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
