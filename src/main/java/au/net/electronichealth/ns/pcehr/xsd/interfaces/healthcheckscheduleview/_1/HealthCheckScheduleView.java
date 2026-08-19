
package au.net.electronichealth.ns.pcehr.xsd.interfaces.healthcheckscheduleview._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for healthCheckScheduleView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="healthCheckScheduleView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="jurisdiction"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NSW"/&gt;
 *               &lt;enumeration value="QLD"/&gt;
 *               &lt;enumeration value="ACT"/&gt;
 *               &lt;enumeration value="NT"/&gt;
 *               &lt;enumeration value="VIC"/&gt;
 *               &lt;enumeration value="WA"/&gt;
 *               &lt;enumeration value="TAS"/&gt;
 *               &lt;enumeration value="SA"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "healthCheckScheduleView", propOrder = {
    "versionNumber",
    "jurisdiction"
})
@XmlRootElement(name = "healthCheckScheduleView")
public class HealthCheckScheduleView {

    @XmlElement(required = true)
    protected String versionNumber;
    @XmlElement(required = true)
    protected String jurisdiction;

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
     * Gets the value of the jurisdiction property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdiction(String value) {
        this.jurisdiction = value;
    }

}
