
package ihe.iti.xds_b._2007;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveDocumentSetRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveDocumentSetRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentRequest" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RepositoryUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
 *                   &lt;element name="DocumentUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "RetrieveDocumentSetRequestType", propOrder = {
    "documentRequests"
})
@XmlRootElement(name = "RetrieveDocumentSetRequest")
public class RetrieveDocumentSetRequest {

    @XmlElement(name = "DocumentRequest", required = true)
    protected List<RetrieveDocumentSetRequest.DocumentRequest> documentRequests;

    /**
     * Gets the value of the documentRequests property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentRequests property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link RetrieveDocumentSetRequest.DocumentRequest }
     * 
     * 
     * @return field value
     */
    public List<RetrieveDocumentSetRequest.DocumentRequest> getDocumentRequests() {
        if (documentRequests == null) {
            documentRequests = new ArrayList<RetrieveDocumentSetRequest.DocumentRequest>();
        }
        return this.documentRequests;
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
     *         &lt;element name="RepositoryUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
     *         &lt;element name="DocumentUniqueId" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName"/&gt;
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
        "repositoryUniqueId",
        "documentUniqueId"
    })
    public static class DocumentRequest {

        @XmlElement(name = "RepositoryUniqueId", required = true)
        protected String repositoryUniqueId;
        @XmlElement(name = "DocumentUniqueId", required = true)
        protected String documentUniqueId;

        /**
         * Gets the value of the repositoryUniqueId property.
         * 
         * @return the result
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRepositoryUniqueId() {
            return repositoryUniqueId;
        }

        /**
         * Sets the value of the repositoryUniqueId property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRepositoryUniqueId(String value) {
            this.repositoryUniqueId = value;
        }

        /**
         * Gets the value of the documentUniqueId property.
         * 
         * @return the result
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentUniqueId() {
            return documentUniqueId;
        }

        /**
         * Sets the value of the documentUniqueId property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentUniqueId(String value) {
            this.documentUniqueId = value;
        }

    }

}
