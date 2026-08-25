
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectorQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}AdhocQueryQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionQueryType", propOrder = {
    "selectorQuery"
})
@XmlRootElement(name = "SubscriptionQuery")
public class SubscriptionQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "SelectorQuery")
    protected AdhocQueryQuery selectorQuery;

    /**
     * Gets the value of the selectorQuery property.
     * 
     * @return the result
     *     possible object is
     *     {@link AdhocQueryQuery }
     *     
     */
    public AdhocQueryQuery getSelectorQuery() {
        return selectorQuery;
    }

    /**
     * Sets the value of the selectorQuery property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link AdhocQueryQuery }
     *     
     */
    public void setSelectorQuery(AdhocQueryQuery value) {
        this.selectorQuery = value;
    }

}
