
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postalDeliveryGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postalDeliveryGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postalDeliveryType" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}postalDeliveryType"/&gt;
 *         &lt;element name="postalDeliveryNumber" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}postalDeliveryNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postalDeliveryGroupType", propOrder = {
    "postalDeliveryType",
    "postalDeliveryNumber"
})
public class PostalDeliveryGroupType {

    @XmlElement(required = true)
    protected PostalDeliveryType postalDeliveryType;
    protected String postalDeliveryNumber;

    /**
     * Gets the value of the postalDeliveryType property.
     * 
     * @return the result
     *     possible object is
     *     {@link PostalDeliveryType }
     *     
     */
    public PostalDeliveryType getPostalDeliveryType() {
        return postalDeliveryType;
    }

    /**
     * Sets the value of the postalDeliveryType property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link PostalDeliveryType }
     *     
     */
    public void setPostalDeliveryType(PostalDeliveryType value) {
        this.postalDeliveryType = value;
    }

    /**
     * Gets the value of the postalDeliveryNumber property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalDeliveryNumber() {
        return postalDeliveryNumber;
    }

    /**
     * Sets the value of the postalDeliveryNumber property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalDeliveryNumber(String value) {
        this.postalDeliveryNumber = value;
    }

}
