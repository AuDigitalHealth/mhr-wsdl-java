
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.gov.nehta.schema.DateAdapter;


/**
 * <p>Java class for individualTypeSupp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="individualTypeSupp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTypeSupp"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}sex"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "individualTypeSupp", propOrder = {
    "name",
    "sex",
    "dateOfBirth"
})
@XmlSeeAlso({
    au.net.electronichealth.ns.pcehr.xsd.interfaces.registerpcehr._2.RegisterPCEHRResponse.Individual.Demographics.class,
    au.net.electronichealth.ns.pcehr.xsd.interfaces.registerpcehr._2.RegisterPCEHR.Representative.Demographics.class,
    au.net.electronichealth.ns.pcehr.xsd.interfaces.registerpcehr._2.RegisterPCEHR.Individual.Demographics.class
})
public class IndividualTypeSupp {

    @XmlElement(required = true)
    protected NameTypeSupp name;
    @XmlElement(required = true)
    protected Sex sex;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar dateOfBirth;

    /**
     * Gets the value of the name property.
     * 
     * @return the result
     *     possible object is
     *     {@link NameTypeSupp }
     *     
     */
    public NameTypeSupp getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link NameTypeSupp }
     *     
     */
    public void setName(NameTypeSupp value) {
        this.name = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return the result
     *     possible object is
     *     {@link Sex }
     *     
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link Sex }
     *     
     */
    public void setSex(Sex value) {
        this.sex = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(Calendar value) {
        this.dateOfBirth = value;
    }

}
