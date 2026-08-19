
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="International"/&gt;
 *               &lt;enumeration value="AustralianStreet"/&gt;
 *               &lt;enumeration value="AustralianPostal"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="suburb" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="postalDeliveryGroup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="postalDeliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="postalDeliveryNumber" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressSiteName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="unitGroup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="unitNumber" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="levelGroup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="levelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="levelNumber" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lotNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="streetNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="streetName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="streetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internationalAddressLine" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="120"/&gt;
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
@XmlType(name = "addressType", propOrder = {
    "type",
    "state",
    "postCode",
    "suburb",
    "postalDeliveryGroup",
    "addressSiteName",
    "unitGroup",
    "levelGroup",
    "lotNumber",
    "streetNumber",
    "streetName",
    "streetType",
    "streetSuffix",
    "country",
    "internationalAddressLine"
})
public class AddressType {

    @XmlElement(required = true)
    protected AddressType.Type type;
    @XmlElement(required = true)
    protected String state;
    protected String postCode;
    protected String suburb;
    protected AddressType.PostalDeliveryGroup postalDeliveryGroup;
    protected String addressSiteName;
    protected AddressType.UnitGroup unitGroup;
    protected AddressType.LevelGroup levelGroup;
    protected String lotNumber;
    protected String streetNumber;
    protected String streetName;
    protected String streetType;
    protected String streetSuffix;
    protected String country;
    protected String internationalAddressLine;

    /**
     * Gets the value of the type property.
     * 
     * @return the result
     *     possible object is
     *     {@link AddressType.Type }
     *     
     */
    public AddressType.Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link AddressType.Type }
     *     
     */
    public void setType(AddressType.Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
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
     *     {@link AddressType.PostalDeliveryGroup }
     *     
     */
    public AddressType.PostalDeliveryGroup getPostalDeliveryGroup() {
        return postalDeliveryGroup;
    }

    /**
     * Sets the value of the postalDeliveryGroup property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link AddressType.PostalDeliveryGroup }
     *     
     */
    public void setPostalDeliveryGroup(AddressType.PostalDeliveryGroup value) {
        this.postalDeliveryGroup = value;
    }

    /**
     * Gets the value of the addressSiteName property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSiteName() {
        return addressSiteName;
    }

    /**
     * Sets the value of the addressSiteName property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSiteName(String value) {
        this.addressSiteName = value;
    }

    /**
     * Gets the value of the unitGroup property.
     * 
     * @return the result
     *     possible object is
     *     {@link AddressType.UnitGroup }
     *     
     */
    public AddressType.UnitGroup getUnitGroup() {
        return unitGroup;
    }

    /**
     * Sets the value of the unitGroup property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link AddressType.UnitGroup }
     *     
     */
    public void setUnitGroup(AddressType.UnitGroup value) {
        this.unitGroup = value;
    }

    /**
     * Gets the value of the levelGroup property.
     * 
     * @return the result
     *     possible object is
     *     {@link AddressType.LevelGroup }
     *     
     */
    public AddressType.LevelGroup getLevelGroup() {
        return levelGroup;
    }

    /**
     * Sets the value of the levelGroup property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link AddressType.LevelGroup }
     *     
     */
    public void setLevelGroup(AddressType.LevelGroup value) {
        this.levelGroup = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the streetNumber property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType(String value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffix(String value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the internationalAddressLine property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalAddressLine() {
        return internationalAddressLine;
    }

    /**
     * Sets the value of the internationalAddressLine property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalAddressLine(String value) {
        this.internationalAddressLine = value;
    }


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
     *         &lt;element name="levelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="levelNumber" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="4"/&gt;
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
        "levelType",
        "levelNumber"
    })
    public static class LevelGroup {

        protected String levelType;
        protected String levelNumber;

        /**
         * Gets the value of the levelType property.
         * 
         * @return the result
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLevelType() {
            return levelType;
        }

        /**
         * Sets the value of the levelType property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLevelType(String value) {
            this.levelType = value;
        }

        /**
         * Gets the value of the levelNumber property.
         * 
         * @return the result
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLevelNumber() {
            return levelNumber;
        }

        /**
         * Sets the value of the levelNumber property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLevelNumber(String value) {
            this.levelNumber = value;
        }

    }


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
     *         &lt;element name="postalDeliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="postalDeliveryNumber" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="11"/&gt;
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
        "postalDeliveryType",
        "postalDeliveryNumber"
    })
    public static class PostalDeliveryGroup {

        protected String postalDeliveryType;
        protected String postalDeliveryNumber;

        /**
         * Gets the value of the postalDeliveryType property.
         * 
         * @return the result
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalDeliveryType() {
            return postalDeliveryType;
        }

        /**
         * Sets the value of the postalDeliveryType property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalDeliveryType(String value) {
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


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="International"/&gt;
     *     &lt;enumeration value="AustralianStreet"/&gt;
     *     &lt;enumeration value="AustralianPostal"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Type {

        @XmlEnumValue("International")
        INTERNATIONAL("International"),
        @XmlEnumValue("AustralianStreet")
        AUSTRALIAN_STREET("AustralianStreet"),
        @XmlEnumValue("AustralianPostal")
        AUSTRALIAN_POSTAL("AustralianPostal");
        private final String value;

        Type(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static AddressType.Type fromValue(String v) {
            for (AddressType.Type c: AddressType.Type.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


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
     *         &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="unitNumber" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="6"/&gt;
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
        "unitType",
        "unitNumber"
    })
    public static class UnitGroup {

        protected String unitType;
        protected String unitNumber;

        /**
         * Gets the value of the unitType property.
         * 
         * @return the result
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitType() {
            return unitType;
        }

        /**
         * Sets the value of the unitType property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitType(String value) {
            this.unitType = value;
        }

        /**
         * Gets the value of the unitNumber property.
         * 
         * @return the result
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitNumber() {
            return unitNumber;
        }

        /**
         * Sets the value of the unitNumber property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitNumber(String value) {
            this.unitNumber = value;
        }

    }

}
