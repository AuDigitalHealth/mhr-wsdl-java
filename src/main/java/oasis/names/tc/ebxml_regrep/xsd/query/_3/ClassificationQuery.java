
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificationQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationSchemeQuery" minOccurs="0"/&gt;
 *         &lt;element name="ClassifiedObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQuery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationQueryType", propOrder = {
    "classificationSchemeQuery",
    "classifiedObjectQuery",
    "classificationNodeQuery"
})
@XmlRootElement(name = "ClassificationQuery")
public class ClassificationQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ClassificationSchemeQuery")
    protected ClassificationSchemeQuery classificationSchemeQuery;
    @XmlElement(name = "ClassifiedObjectQuery")
    protected RegistryObjectQueryType classifiedObjectQuery;
    @XmlElement(name = "ClassificationNodeQuery")
    protected ClassificationNodeQuery classificationNodeQuery;

    /**
     * Gets the value of the classificationSchemeQuery property.
     * 
     * @return the result
     *     possible object is
     *     {@link ClassificationSchemeQuery }
     *     
     */
    public ClassificationSchemeQuery getClassificationSchemeQuery() {
        return classificationSchemeQuery;
    }

    /**
     * Sets the value of the classificationSchemeQuery property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link ClassificationSchemeQuery }
     *     
     */
    public void setClassificationSchemeQuery(ClassificationSchemeQuery value) {
        this.classificationSchemeQuery = value;
    }

    /**
     * Gets the value of the classifiedObjectQuery property.
     * 
     * @return the result
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getClassifiedObjectQuery() {
        return classifiedObjectQuery;
    }

    /**
     * Sets the value of the classifiedObjectQuery property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setClassifiedObjectQuery(RegistryObjectQueryType value) {
        this.classifiedObjectQuery = value;
    }

    /**
     * Gets the value of the classificationNodeQuery property.
     * 
     * @return the result
     *     possible object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public ClassificationNodeQuery getClassificationNodeQuery() {
        return classificationNodeQuery;
    }

    /**
     * Sets the value of the classificationNodeQuery property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public void setClassificationNodeQuery(ClassificationNodeQuery value) {
        this.classificationNodeQuery = value;
    }

}
