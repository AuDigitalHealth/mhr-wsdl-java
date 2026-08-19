
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistryObjectListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryObjectListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ExtrinsicObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Classification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Association" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Identifiable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryObjectListType", propOrder = {
    "extrinsicObjects",
    "registryPackages",
    "classifications",
    "associations",
    "identifiables"
})
@XmlRootElement(name = "RegistryObjectList")
public class RegistryObjectList {

    @XmlElement(name = "ExtrinsicObject")
    protected List<ExtrinsicObjectType> extrinsicObjects;
    @XmlElement(name = "RegistryPackage")
    protected List<RegistryPackageType> registryPackages;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classifications;
    @XmlElement(name = "Association")
    protected List<AssociationType1> associations;
    @XmlElementRef(name = "Identifiable", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends IdentifiableType>> identifiables;

    /**
     * Gets the value of the extrinsicObjects property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsicObjects property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsicObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link ExtrinsicObjectType }
     * 
     * 
     * @return field value
     */
    public List<ExtrinsicObjectType> getExtrinsicObjects() {
        if (extrinsicObjects == null) {
            extrinsicObjects = new ArrayList<ExtrinsicObjectType>();
        }
        return this.extrinsicObjects;
    }

    /**
     * Gets the value of the registryPackages property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registryPackages property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getRegistryPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link RegistryPackageType }
     * 
     * 
     * @return field value
     */
    public List<RegistryPackageType> getRegistryPackages() {
        if (registryPackages == null) {
            registryPackages = new ArrayList<RegistryPackageType>();
        }
        return this.registryPackages;
    }

    /**
     * Gets the value of the classifications property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifications property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     * @return field value
     */
    public List<ClassificationType> getClassifications() {
        if (classifications == null) {
            classifications = new ArrayList<ClassificationType>();
        }
        return this.classifications;
    }

    /**
     * Gets the value of the associations property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associations property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link AssociationType1 }
     * 
     * 
     * @return field value
     */
    public List<AssociationType1> getAssociations() {
        if (associations == null) {
            associations = new ArrayList<AssociationType1>();
        }
        return this.associations;
    }

    /**
     * Gets the value of the identifiables property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiables property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiables().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ObjectRefType }&gt;
     * {@link JAXBElement }{@code <}{@link ClassificationNodeType }&gt;
     * {@link JAXBElement }{@code <}{@link ExternalIdentifierType }&gt;
     * {@link JAXBElement }{@code <}{@link ServiceBindingType }&gt;
     * {@link JAXBElement }{@code <}{@link OrganizationType }&gt;
     * {@link JAXBElement }{@code <}{@link AuditableEventType }&gt;
     * {@link JAXBElement }{@code <}{@link SpecificationLinkType }&gt;
     * {@link JAXBElement }{@code <}{@link AssociationType1 }&gt;
     * {@link JAXBElement }{@code <}{@link UserType }&gt;
     * {@link JAXBElement }{@code <}{@link RegistryType }&gt;
     * {@link JAXBElement }{@code <}{@link IdentifiableType }&gt;
     * {@link JAXBElement }{@code <}{@link AdhocQueryType }&gt;
     * {@link JAXBElement }{@code <}{@link ExtrinsicObjectType }&gt;
     * {@link JAXBElement }{@code <}{@link ClassificationType }&gt;
     * {@link JAXBElement }{@code <}{@link RegistryPackageType }&gt;
     * {@link JAXBElement }{@code <}{@link SubscriptionType }&gt;
     * {@link JAXBElement }{@code <}{@link PersonType }&gt;
     * {@link JAXBElement }{@code <}{@link FederationType }&gt;
     * {@link JAXBElement }{@code <}{@link ServiceType }&gt;
     * {@link JAXBElement }{@code <}{@link ClassificationSchemeType }&gt;
     * {@link JAXBElement }{@code <}{@link RegistryObjectType }&gt;
     * {@link JAXBElement }{@code <}{@link ExternalLinkType }&gt;
     * 
     * 
     * @return field value
     */
    public List<JAXBElement<? extends IdentifiableType>> getIdentifiables() {
        if (identifiables == null) {
            identifiables = new ArrayList<JAXBElement<? extends IdentifiableType>>();
        }
        return this.identifiables;
    }

}
