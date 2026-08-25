
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ClassificationScheme is the mapping of the same named
 *         interface in ebRIM. It extends RegistryObject.
 * 
 * <p>Java class for ClassificationSchemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationSchemeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ClassificationNode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isInternal" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="nodeType" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationSchemeType", propOrder = {
    "classificationNodes"
})
public class ClassificationSchemeType
    extends RegistryObjectType
{

    @XmlElement(name = "ClassificationNode")
    protected List<ClassificationNodeType> classificationNodes;
    @XmlAttribute(name = "isInternal", required = true)
    protected boolean isInternal;
    @XmlAttribute(name = "nodeType", required = true)
    protected String nodeType;

    /**
     * Gets the value of the classificationNodes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationNodes property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link ClassificationNodeType }
     * 
     * 
     * @return field value
     */
    public List<ClassificationNodeType> getClassificationNodes() {
        if (classificationNodes == null) {
            classificationNodes = new ArrayList<ClassificationNodeType>();
        }
        return this.classificationNodes;
    }

    /**
     * Gets the value of the isInternal property.
     * 
     * @return field value
     */
    public boolean isIsInternal() {
        return isInternal;
    }

    /**
     * Sets the value of the isInternal property.
     * 
     * @param value field value
     */
    public void setIsInternal(boolean value) {
        this.isInternal = value;
    }

    /**
     * Gets the value of the nodeType property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * Sets the value of the nodeType property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeType(String value) {
        this.nodeType = value;
    }

}
