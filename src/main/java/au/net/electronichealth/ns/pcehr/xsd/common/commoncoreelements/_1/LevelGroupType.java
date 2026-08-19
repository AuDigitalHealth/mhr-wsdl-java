
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for levelGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="levelGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="levelType" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}levelType"/&gt;
 *         &lt;element name="levelNumber" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}levelNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "levelGroupType", propOrder = {
    "levelType",
    "levelNumber"
})
public class LevelGroupType {

    @XmlElement(required = true)
    protected LevelType levelType;
    protected String levelNumber;

    /**
     * Gets the value of the levelType property.
     * 
     * @return the result
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getLevelType() {
        return levelType;
    }

    /**
     * Sets the value of the levelType property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setLevelType(LevelType value) {
        this.levelType = value;
    }

    /**
     * Gets the value of the levelNumber property.
     * 
     * @return the result
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelNumber() {
        return levelNumber;
    }

    /**
     * Sets the value of the levelNumber property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelNumber(String value) {
        this.levelNumber = value;
    }

}
