
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getview._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;


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
 *         &lt;element name="responseStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/&gt;
 *         &lt;element name="view" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="templateID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
@XmlType(name = "", propOrder = {
    "responseStatus",
    "view"
})
@XmlRootElement(name = "getViewResponse")
public class GetViewResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    protected GetViewResponse.View view;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return the result
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return the result
     *     possible object is
     *     {@link GetViewResponse.View }
     *     
     */
    public GetViewResponse.View getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link GetViewResponse.View }
     *     
     */
    public void setView(GetViewResponse.View value) {
        this.view = value;
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
     *         &lt;element name="templateID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
        "templateID",
        "data"
    })
    public static class View {

        @XmlElement(required = true)
        protected String templateID;
        @XmlElement(required = true)
        protected byte[] data;

        /**
         * Gets the value of the templateID property.
         * 
         * @return the result
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemplateID() {
            return templateID;
        }

        /**
         * Sets the value of the templateID property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemplateID(String value) {
            this.templateID = value;
        }

        /**
         * Gets the value of the data property.
         * 
         * @return the result
         *     possible object is
         *     byte[]
         */
        public byte[] getData() {
            return data;
        }

        /**
         * Sets the value of the data property.
         * 
         * @param value field value
         *     allowed object is
         *     byte[]
         */
        public void setData(byte[] value) {
            this.data = value;
        }

    }

}
