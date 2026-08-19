
package au.net.electronichealth.ns.tplt.xsd.interfaces.searchtemplate._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;
import au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1.TemplateMetadataType;
import au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1.TemplateUsageMetadataType;


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
 *         &lt;element name="template" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="templateMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateMetadataType"/&gt;
 *                   &lt;element name="usageMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateUsageMetadataType" minOccurs="0"/&gt;
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
    "templates"
})
@XmlRootElement(name = "searchTemplateResponse")
public class SearchTemplateResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    @XmlElement(name = "template")
    protected List<SearchTemplateResponse.Template> templates;

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
     * Gets the value of the templates property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templates property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link SearchTemplateResponse.Template }
     * 
     * 
     * @return field value
     */
    public List<SearchTemplateResponse.Template> getTemplates() {
        if (templates == null) {
            templates = new ArrayList<SearchTemplateResponse.Template>();
        }
        return this.templates;
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
     *         &lt;element name="templateMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateMetadataType"/&gt;
     *         &lt;element name="usageMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateUsageMetadataType" minOccurs="0"/&gt;
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
        "templateMetadata",
        "usageMetadata"
    })
    public static class Template {

        @XmlElement(required = true)
        protected TemplateMetadataType templateMetadata;
        protected TemplateUsageMetadataType usageMetadata;

        /**
         * Gets the value of the templateMetadata property.
         * 
         * @return the result
         *     possible object is
         *     {@link TemplateMetadataType }
         *     
         */
        public TemplateMetadataType getTemplateMetadata() {
            return templateMetadata;
        }

        /**
         * Sets the value of the templateMetadata property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link TemplateMetadataType }
         *     
         */
        public void setTemplateMetadata(TemplateMetadataType value) {
            this.templateMetadata = value;
        }

        /**
         * Gets the value of the usageMetadata property.
         * 
         * @return the result
         *     possible object is
         *     {@link TemplateUsageMetadataType }
         *     
         */
        public TemplateUsageMetadataType getUsageMetadata() {
            return usageMetadata;
        }

        /**
         * Sets the value of the usageMetadata property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link TemplateUsageMetadataType }
         *     
         */
        public void setUsageMetadata(TemplateUsageMetadataType value) {
            this.usageMetadata = value;
        }

    }

}
