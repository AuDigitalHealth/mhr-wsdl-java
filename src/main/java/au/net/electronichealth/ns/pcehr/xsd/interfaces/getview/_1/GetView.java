
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getview._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
    "view"
})
@XmlRootElement(name = "getView")
public class GetView {

    @XmlElement(required = true)
    protected Object view;

    /**
     * Gets the value of the view property.
     * 
     * @return the result
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setView(Object value) {
        this.view = value;
    }

}
