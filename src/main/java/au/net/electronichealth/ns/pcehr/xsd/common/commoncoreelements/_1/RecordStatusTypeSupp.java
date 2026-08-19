
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordStatusTypeSupp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="recordStatusTypeSupp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Verified"/&gt;
 *     &lt;enumeration value="Unverified"/&gt;
 *     &lt;enumeration value="Provisional"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "recordStatusTypeSupp")
@XmlEnum
public enum RecordStatusTypeSupp {

    @XmlEnumValue("Verified")
    VERIFIED("Verified"),
    @XmlEnumValue("Unverified")
    UNVERIFIED("Unverified"),
    @XmlEnumValue("Provisional")
    PROVISIONAL("Provisional");
    private final String value;

    RecordStatusTypeSupp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordStatusTypeSupp fromValue(String v) {
        for (RecordStatusTypeSupp c: RecordStatusTypeSupp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
