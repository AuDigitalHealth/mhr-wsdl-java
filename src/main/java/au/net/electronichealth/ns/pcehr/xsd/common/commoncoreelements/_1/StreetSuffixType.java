
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streetSuffixType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="streetSuffixType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CN"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="EX"/&gt;
 *     &lt;enumeration value="LR"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="SW"/&gt;
 *     &lt;enumeration value="UP"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "streetSuffixType")
@XmlEnum
public enum StreetSuffixType {


    /**
     * Central
     * 
     */
    CN,

    /**
     * East
     * 
     */
    E,

    /**
     * Extension
     * 
     */
    EX,

    /**
     * Lower
     * 
     */
    LR,

    /**
     * North
     * 
     */
    N,

    /**
     * North East
     * 
     */
    NE,

    /**
     * North West
     * 
     */
    NW,

    /**
     * South
     * 
     */
    S,

    /**
     * South East
     * 
     */
    SE,

    /**
     * South West
     * 
     */
    SW,

    /**
     * Upper
     * 
     */
    UP,

    /**
     * West
     * 
     */
    W;

    public String value() {
        return name();
    }

    public static StreetSuffixType fromValue(String v) {
        return valueOf(v);
    }

}
