
package au.net.electronichealth.ns.pcehr.xsd.interfaces.pcehrprofile._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.pcehr.xsd.interfaces.pcehrprofile._1 package. 
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

    private final static QName _DoesPCEHRExist_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/interfaces/PCEHRProfile/1.0", "doesPCEHRExist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.pcehr.xsd.interfaces.pcehrprofile._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoesPCEHRExistResponse }
     * 
     * @return newly created instance
     */
    public DoesPCEHRExistResponse createDoesPCEHRExistResponse() {
        return new DoesPCEHRExistResponse();
    }

    /**
     * Create an instance of {@link GainPCEHRAccess }
     * 
     * @return newly created instance
     */
    public GainPCEHRAccess createGainPCEHRAccess() {
        return new GainPCEHRAccess();
    }

    /**
     * Create an instance of {@link GainPCEHRAccess.PCEHRRecord }
     * 
     * @return newly created instance
     */
    public GainPCEHRAccess.PCEHRRecord createGainPCEHRAccessPCEHRRecord() {
        return new GainPCEHRAccess.PCEHRRecord();
    }

    /**
     * Create an instance of {@link GainPCEHRAccess.PCEHRRecord.AuthorisationDetails }
     * 
     * @return newly created instance
     */
    public GainPCEHRAccess.PCEHRRecord.AuthorisationDetails createGainPCEHRAccessPCEHRRecordAuthorisationDetails() {
        return new GainPCEHRAccess.PCEHRRecord.AuthorisationDetails();
    }

    /**
     * Create an instance of {@link GainPCEHRAccessResponse }
     * 
     * @return newly created instance
     */
    public GainPCEHRAccessResponse createGainPCEHRAccessResponse() {
        return new GainPCEHRAccessResponse();
    }

    /**
     * Create an instance of {@link GainPCEHRAccessResponse.Individual }
     * 
     * @return newly created instance
     */
    public GainPCEHRAccessResponse.Individual createGainPCEHRAccessResponseIndividual() {
        return new GainPCEHRAccessResponse.Individual();
    }

    /**
     * Create an instance of {@link GainPCEHRAccess.PCEHRRecord.Individual }
     * 
     * @return newly created instance
     */
    public GainPCEHRAccess.PCEHRRecord.Individual createGainPCEHRAccessPCEHRRecordIndividual() {
        return new GainPCEHRAccess.PCEHRRecord.Individual();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/interfaces/PCEHRProfile/1.0", name = "doesPCEHRExist")
    public JAXBElement<Object> createDoesPCEHRExist(Object value) {
        return new JAXBElement<Object>(_DoesPCEHRExist_QNAME, Object.class, null, value);
    }

}
