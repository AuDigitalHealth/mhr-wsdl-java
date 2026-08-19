
package au.net.electronichealth.ns.pcehr.xsd.interfaces.pcehrprofile._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PCEHRExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="accessCodeRequired" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="WithCode"/&gt;
 *               &lt;enumeration value="WithoutCode"/&gt;
 *               &lt;enumeration value="AccessGranted"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pcehrExists",
    "accessCodeRequired"
})
@XmlRootElement(name = "doesPCEHRExistResponse")
public class DoesPCEHRExistResponse {

    @XmlElement(name = "PCEHRExists")
    protected boolean pcehrExists;
    protected DoesPCEHRExistResponse.AccessCodeRequired accessCodeRequired;

    /**
     * Gets the value of the pcehrExists property.
     * 
     * @return field value
     */
    public boolean isPCEHRExists() {
        return pcehrExists;
    }

    /**
     * Sets the value of the pcehrExists property.
     * 
     * @param value field value
     */
    public void setPCEHRExists(boolean value) {
        this.pcehrExists = value;
    }

    /**
     * Gets the value of the accessCodeRequired property.
     * 
     * @return the result
     *     possible object is
     *     {@link DoesPCEHRExistResponse.AccessCodeRequired }
     *     
     */
    public DoesPCEHRExistResponse.AccessCodeRequired getAccessCodeRequired() {
        return accessCodeRequired;
    }

    /**
     * Sets the value of the accessCodeRequired property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link DoesPCEHRExistResponse.AccessCodeRequired }
     *     
     */
    public void setAccessCodeRequired(DoesPCEHRExistResponse.AccessCodeRequired value) {
        this.accessCodeRequired = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="WithCode"/&gt;
     *     &lt;enumeration value="WithoutCode"/&gt;
     *     &lt;enumeration value="AccessGranted"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum AccessCodeRequired {

        @XmlEnumValue("WithCode")
        WITH_CODE("WithCode"),
        @XmlEnumValue("WithoutCode")
        WITHOUT_CODE("WithoutCode"),
        @XmlEnumValue("AccessGranted")
        ACCESS_GRANTED("AccessGranted");
        private final String value;

        AccessCodeRequired(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static DoesPCEHRExistResponse.AccessCodeRequired fromValue(String v) {
            for (DoesPCEHRExistResponse.AccessCodeRequired c: DoesPCEHRExistResponse.AccessCodeRequired.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
