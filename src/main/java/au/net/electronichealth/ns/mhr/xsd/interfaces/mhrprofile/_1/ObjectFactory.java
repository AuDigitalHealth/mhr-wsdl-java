
package au.net.electronichealth.ns.mhr.xsd.interfaces.mhrprofile._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.mhr.xsd.interfaces.mhrprofile._1 package. 
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

    private final static QName _DoesMHRExist_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/interfaces/PCEHRProfile/1.0", "doesPCEHRExist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.mhr.xsd.interfaces.mhrprofile._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoesMHRExistResponse }
     * 
     * @return newly created instance
     */
    public DoesMHRExistResponse createDoesMHRExistResponse() {
        return new DoesMHRExistResponse();
    }

    /**
     * Create an instance of {@link GainMHRAccess }
     * 
     * @return newly created instance
     */
    public GainMHRAccess createGainMHRAccess() {
        return new GainMHRAccess();
    }

    /**
     * Create an instance of {@link GainMHRAccess.MHRRecord }
     * 
     * @return newly created instance
     */
    public GainMHRAccess.MHRRecord createGainMHRAccessMHRRecord() {
        return new GainMHRAccess.MHRRecord();
    }

    /**
     * Create an instance of {@link GainMHRAccess.MHRRecord.AuthorisationDetails }
     * 
     * @return newly created instance
     */
    public GainMHRAccess.MHRRecord.AuthorisationDetails createGainMHRAccessMHRRecordAuthorisationDetails() {
        return new GainMHRAccess.MHRRecord.AuthorisationDetails();
    }

    /**
     * Create an instance of {@link GainMHRAccessResponse }
     * 
     * @return newly created instance
     */
    public GainMHRAccessResponse createGainMHRAccessResponse() {
        return new GainMHRAccessResponse();
    }

    /**
     * Create an instance of {@link GainMHRAccessResponse.Individual }
     * 
     * @return newly created instance
     */
    public GainMHRAccessResponse.Individual createGainMHRAccessResponseIndividual() {
        return new GainMHRAccessResponse.Individual();
    }

    /**
     * Create an instance of {@link GainMHRAccess.MHRRecord.Individual }
     * 
     * @return newly created instance
     */
    public GainMHRAccess.MHRRecord.Individual createGainMHRAccessMHRRecordIndividual() {
        return new GainMHRAccess.MHRRecord.Individual();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/interfaces/PCEHRProfile/1.0", name = "doesPCEHRExist")
    public JAXBElement<Object> createDoesMHRExist(Object value) {
        return new JAXBElement<Object>(_DoesMHRExist_QNAME, Object.class, null, value);
    }

}
