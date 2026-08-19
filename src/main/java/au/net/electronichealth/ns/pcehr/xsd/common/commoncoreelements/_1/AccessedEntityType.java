
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accessedEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accessedEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber" minOccurs="0"/&gt;
 *         &lt;element name="ihiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessedEntityType", propOrder = {
    "ihiNumber",
    "ihiName",
    "subjectType",
    "subject"
})
public class AccessedEntityType {

    protected String ihiNumber;
    protected String ihiName;
    protected String subjectType;
    protected String subject;

    /**
     * Gets the value of the ihiNumber property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhiNumber() {
        return ihiNumber;
    }

    /**
     * Sets the value of the ihiNumber property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhiNumber(String value) {
        this.ihiNumber = value;
    }

    /**
     * Gets the value of the ihiName property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhiName() {
        return ihiName;
    }

    /**
     * Sets the value of the ihiName property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhiName(String value) {
        this.ihiName = value;
    }

    /**
     * Gets the value of the subjectType property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectType() {
        return subjectType;
    }

    /**
     * Sets the value of the subjectType property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectType(String value) {
        this.subjectType = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
