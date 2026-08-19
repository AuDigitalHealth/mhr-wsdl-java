
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getindividualdetailsview._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.pcehr.xsd.interfaces.getindividualdetailsview._2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetIndividualDetailsView_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/interfaces/GetIndividualDetailsView/2.0", "getIndividualDetailsView");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.pcehr.xsd.interfaces.getindividualdetailsview._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIndividualDetailsViewResponse }
     * 
     * @return newly created instance
     */
    public GetIndividualDetailsViewResponse createGetIndividualDetailsViewResponse() {
        return new GetIndividualDetailsViewResponse();
    }

    /**
     * Create an instance of {@link GetIndividualDetailsViewResponse.Individual }
     * 
     * @return newly created instance
     */
    public GetIndividualDetailsViewResponse.Individual createGetIndividualDetailsViewResponseIndividual() {
        return new GetIndividualDetailsViewResponse.Individual();
    }

    /**
     * Create an instance of {@link GetIndividualDetailsViewResponse.Individual.ContactPersons }
     * 
     * @return newly created instance
     */
    public GetIndividualDetailsViewResponse.Individual.ContactPersons createGetIndividualDetailsViewResponseIndividualContactPersons() {
        return new GetIndividualDetailsViewResponse.Individual.ContactPersons();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/interfaces/GetIndividualDetailsView/2.0", name = "getIndividualDetailsView")
    public JAXBElement<Object> createGetIndividualDetailsView(Object value) {
        return new JAXBElement<Object>(_GetIndividualDetailsView_QNAME, Object.class, null, value);
    }

}
