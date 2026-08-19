
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="statusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Deceased"/&gt;
 *     &lt;enumeration value="Retired"/&gt;
 *     &lt;enumeration value="Resolved"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Deceased")
    DECEASED("Deceased"),
    @XmlEnumValue("Retired")
    RETIRED("Retired"),
    @XmlEnumValue("Resolved")
    RESOLVED("Resolved"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
