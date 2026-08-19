
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PersonNameFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneNumberFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonQueryType", propOrder = {
    "addressFilters",
    "personNameFilter",
    "telephoneNumberFilters",
    "emailAddressFilters"
})
@XmlSeeAlso({
    UserQuery.class
})
public class PersonQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AddressFilter")
    protected List<FilterType> addressFilters;
    @XmlElement(name = "PersonNameFilter")
    protected FilterType personNameFilter;
    @XmlElement(name = "TelephoneNumberFilter")
    protected List<FilterType> telephoneNumberFilters;
    @XmlElement(name = "EmailAddressFilter")
    protected List<FilterType> emailAddressFilters;

    /**
     * Gets the value of the addressFilters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressFilters property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getAddressFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     * @return field value
     */
    public List<FilterType> getAddressFilters() {
        if (addressFilters == null) {
            addressFilters = new ArrayList<FilterType>();
        }
        return this.addressFilters;
    }

    /**
     * Gets the value of the personNameFilter property.
     * 
     * @return the result
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getPersonNameFilter() {
        return personNameFilter;
    }

    /**
     * Sets the value of the personNameFilter property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setPersonNameFilter(FilterType value) {
        this.personNameFilter = value;
    }

    /**
     * Gets the value of the telephoneNumberFilters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumberFilters property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumberFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     * @return field value
     */
    public List<FilterType> getTelephoneNumberFilters() {
        if (telephoneNumberFilters == null) {
            telephoneNumberFilters = new ArrayList<FilterType>();
        }
        return this.telephoneNumberFilters;
    }

    /**
     * Gets the value of the emailAddressFilters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddressFilters property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddressFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     * @return field value
     */
    public List<FilterType> getEmailAddressFilters() {
        if (emailAddressFilters == null) {
            emailAddressFilters = new ArrayList<FilterType>();
        }
        return this.emailAddressFilters;
    }

}
