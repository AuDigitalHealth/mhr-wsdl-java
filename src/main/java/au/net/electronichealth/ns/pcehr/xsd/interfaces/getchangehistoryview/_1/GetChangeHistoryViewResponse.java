
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getchangehistoryview._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectList;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryResponseType;


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
 *         &lt;element name="AdhocQueryResponse"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryResponseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectList"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="startIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="totalResultCount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "adhocQueryResponse"
})
@XmlRootElement(name = "getChangeHistoryViewResponse")
public class GetChangeHistoryViewResponse {

    @XmlElement(name = "AdhocQueryResponse", required = true, nillable = true)
    protected GetChangeHistoryViewResponse.AdhocQueryResponse adhocQueryResponse;

    /**
     * Gets the value of the adhocQueryResponse property.
     * 
     * @return the result
     *     possible object is
     *     {@link GetChangeHistoryViewResponse.AdhocQueryResponse }
     *     
     */
    public GetChangeHistoryViewResponse.AdhocQueryResponse getAdhocQueryResponse() {
        return adhocQueryResponse;
    }

    /**
     * Sets the value of the adhocQueryResponse property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link GetChangeHistoryViewResponse.AdhocQueryResponse }
     *     
     */
    public void setAdhocQueryResponse(GetChangeHistoryViewResponse.AdhocQueryResponse value) {
        this.adhocQueryResponse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryResponseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectList"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="startIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="totalResultCount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "registryObjectList"
    })
    public static class AdhocQueryResponse
        extends RegistryResponseType
    {

        @XmlElement(name = "RegistryObjectList", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", required = true)
        protected RegistryObjectList registryObjectList;
        @XmlAttribute(name = "startIndex")
        protected BigInteger startIndex;
        @XmlAttribute(name = "totalResultCount")
        protected BigInteger totalResultCount;

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
         * Gets the value of the startIndex property.
         * 
         * @return the result
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStartIndex() {
            return startIndex;
        }

        /**
         * Sets the value of the startIndex property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStartIndex(BigInteger value) {
            this.startIndex = value;
        }

        /**
         * Gets the value of the totalResultCount property.
         * 
         * @return the result
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalResultCount() {
            return totalResultCount;
        }

        /**
         * Sets the value of the totalResultCount property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalResultCount(BigInteger value) {
            this.totalResultCount = value;
        }

    }

}
