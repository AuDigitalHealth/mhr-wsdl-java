
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for australianPostalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="australianPostalAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="state" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}stateType"/&gt;
 *         &lt;element name="postcode" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}postcodeType"/&gt;
 *         &lt;element name="suburb" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}suburbType"/&gt;
 *         &lt;element name="postalDeliveryGroup" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}postalDeliveryGroupType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "australianPostalAddressType", propOrder = {
    "state",
    "postcode",
    "suburb",
    "postalDeliveryGroup"
})
public class AustralianPostalAddressType {

    @XmlElement(required = true)
    protected StateType state;
    @XmlElement(required = true)
    protected String postcode;
    @XmlElement(required = true)
    protected String suburb;
    @XmlElement(required = true)
    protected PostalDeliveryGroupType postalDeliveryGroup;

    /**
     * Gets the value of the state property.
     * 
     * @return the result
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the suburb property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Sets the value of the suburb property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuburb(String value) {
        this.suburb = value;
    }

    /**
     * Gets the value of the postalDeliveryGroup property.
     * 
     * @return the result
     *     possible object is
     *     {@link PostalDeliveryGroupType }
     *     
     */
    public PostalDeliveryGroupType getPostalDeliveryGroup() {
        return postalDeliveryGroup;
    }

    /**
     * Sets the value of the postalDeliveryGroup property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link PostalDeliveryGroupType }
     *     
     */
    public void setPostalDeliveryGroup(PostalDeliveryGroupType value) {
        this.postalDeliveryGroup = value;
    }

}
