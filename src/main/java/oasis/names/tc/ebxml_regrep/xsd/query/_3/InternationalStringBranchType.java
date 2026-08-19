
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalStringBranchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalStringBranchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}BranchType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocalizedStringFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalStringBranchType", propOrder = {
    "localizedStringFilters"
})
public class InternationalStringBranchType
    extends BranchType
{

    @XmlElement(name = "LocalizedStringFilter")
    protected List<FilterType> localizedStringFilters;

    /**
     * Gets the value of the localizedStringFilters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localizedStringFilters property.
     * 
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizedStringFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     * @return field value
     */
    public List<FilterType> getLocalizedStringFilters() {
        if (localizedStringFilters == null) {
            localizedStringFilters = new ArrayList<FilterType>();
        }
        return this.localizedStringFilters;
    }

}
