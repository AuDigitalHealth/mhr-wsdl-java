
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notification of registry events.
 * 
 * <p>Java class for NotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectList"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="subscription" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationType", propOrder = {
    "registryObjectList"
})
@XmlRootElement(name = "Notification")
public class Notification
    extends RegistryObjectType
{

    @XmlElement(name = "RegistryObjectList", required = true)
    protected RegistryObjectList registryObjectList;
    @XmlAttribute(name = "subscription", required = true)
    protected String subscription;

    /**
     * Gets the value of the registryObjectList property.
     * 
     * @return the result
     *     possible object is
     *     {@link RegistryObjectList }
     *     
     */
    public RegistryObjectList getRegistryObjectList() {
        return registryObjectList;
    }

    /**
     * Sets the value of the registryObjectList property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link RegistryObjectList }
     *     
     */
    public void setRegistryObjectList(RegistryObjectList value) {
        this.registryObjectList = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscription(String value) {
        this.subscription = value;
    }

}
