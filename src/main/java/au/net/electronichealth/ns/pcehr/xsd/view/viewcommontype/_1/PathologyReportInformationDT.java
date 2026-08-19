
package au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pathologyReportInformationDT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pathologyReportInformationDT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CDAeffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateTimeReportAuthored" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateTimeAuthorisation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pathologistLocalReportId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pathologyReportInformationDT", propOrder = {
    "cdAeffectiveTime",
    "dateTimeReportAuthored",
    "dateTimeAuthorisation",
    "pathologistLocalReportId",
    "reportName",
    "reportStatus",
    "documentId",
    "documentLink"
})
public class PathologyReportInformationDT {

    @XmlElement(name = "CDAeffectiveTime", required = true)
    protected String cdAeffectiveTime;
    @XmlElement(required = true)
    protected String dateTimeReportAuthored;
    @XmlElement(required = true)
    protected String dateTimeAuthorisation;
    @XmlElement(required = true)
    protected String pathologistLocalReportId;
    @XmlElement(required = true)
    protected String reportName;
    @XmlElement(required = true)
    protected CodedType reportStatus;
    @XmlElement(required = true)
    protected String documentId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentLink;

    /**
     * Gets the value of the cdAeffectiveTime property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDAeffectiveTime() {
        return cdAeffectiveTime;
    }

    /**
     * Sets the value of the cdAeffectiveTime property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDAeffectiveTime(String value) {
        this.cdAeffectiveTime = value;
    }

    /**
     * Gets the value of the dateTimeReportAuthored property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeReportAuthored() {
        return dateTimeReportAuthored;
    }

    /**
     * Sets the value of the dateTimeReportAuthored property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeReportAuthored(String value) {
        this.dateTimeReportAuthored = value;
    }

    /**
     * Gets the value of the dateTimeAuthorisation property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeAuthorisation() {
        return dateTimeAuthorisation;
    }

    /**
     * Sets the value of the dateTimeAuthorisation property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeAuthorisation(String value) {
        this.dateTimeAuthorisation = value;
    }

    /**
     * Gets the value of the pathologistLocalReportId property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathologistLocalReportId() {
        return pathologistLocalReportId;
    }

    /**
     * Sets the value of the pathologistLocalReportId property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathologistLocalReportId(String value) {
        this.pathologistLocalReportId = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the reportStatus property.
     * 
     * @return the result
     *     possible object is
     *     {@link CodedType }
     *     
     */
    public CodedType getReportStatus() {
        return reportStatus;
    }

    /**
     * Sets the value of the reportStatus property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link CodedType }
     *     
     */
    public void setReportStatus(CodedType value) {
        this.reportStatus = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the documentLink property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentLink() {
        return documentLink;
    }

    /**
     * Sets the value of the documentLink property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentLink(String value) {
        this.documentLink = value;
    }

}
