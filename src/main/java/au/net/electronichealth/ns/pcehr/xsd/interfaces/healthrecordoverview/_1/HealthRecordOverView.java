
package au.net.electronichealth.ns.pcehr.xsd.interfaces.healthrecordoverview._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for healthRecordOverView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="healthRecordOverView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clinicalSynopsisLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "healthRecordOverView", propOrder = {
    "versionNumber",
    "clinicalSynopsisLength"
})
@XmlRootElement(name = "healthRecordOverView")
public class HealthRecordOverView {

    @XmlElement(required = true)
    protected String versionNumber;
    protected int clinicalSynopsisLength;

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the clinicalSynopsisLength property.
     * 
     * @return field value
     */
    public int getClinicalSynopsisLength() {
        return clinicalSynopsisLength;
    }

    /**
     * Sets the value of the clinicalSynopsisLength property.
     * 
     * @param value field value
     */
    public void setClinicalSynopsisLength(int value) {
        this.clinicalSynopsisLength = value;
    }

}
