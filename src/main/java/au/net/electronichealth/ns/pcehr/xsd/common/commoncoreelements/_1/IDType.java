
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IDType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="3"/&gt;
 *     &lt;enumeration value="IHI"/&gt;
 *     &lt;enumeration value="MCA"/&gt;
 *     &lt;enumeration value="DVA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IDType")
@XmlEnum
public enum IDType {

    IHI,
    MCA,
    DVA;

    public String value() {
        return name();
    }

    public static IDType fromValue(String v) {
        return valueOf(v);
    }

}
