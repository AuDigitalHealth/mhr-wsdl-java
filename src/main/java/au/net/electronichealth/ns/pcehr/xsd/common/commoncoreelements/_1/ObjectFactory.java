
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1 package. 
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

    private final static QName _DvaFileNumber_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "dvaFileNumber");
    private final static QName _Sex_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "sex");
    private final static QName _IhiNumber_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "ihiNumber");
    private final static QName _MedicareCardNumber_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "medicareCardNumber");
    private final static QName _DateAccuracyIndicatorType_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "dateAccuracyIndicatorType");
    private final static QName _MedicareIRN_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "medicareIRN");
    private final static QName _MilitaryHealthNumber_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "militaryHealthNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PCEHRHeader }
     * 
     * @return newly created instance
     */
    public PCEHRHeader createPCEHRHeader() {
        return new PCEHRHeader();
    }

    /**
     * Create an instance of {@link AccessConditionsType }
     * 
     * @return newly created instance
     */
    public AccessConditionsType createAccessConditionsType() {
        return new AccessConditionsType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     * @return newly created instance
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link OrganisationServiceType }
     * 
     * @return newly created instance
     */
    public OrganisationServiceType createOrganisationServiceType() {
        return new OrganisationServiceType();
    }

    /**
     * Create an instance of {@link OrganisationServiceType.ComplexDate }
     * 
     * @return newly created instance
     */
    public OrganisationServiceType.ComplexDate createOrganisationServiceTypeComplexDate() {
        return new OrganisationServiceType.ComplexDate();
    }

    /**
     * Create an instance of {@link ParticipantActionType }
     * 
     * @return newly created instance
     */
    public ParticipantActionType createParticipantActionType() {
        return new ParticipantActionType();
    }

    /**
     * Create an instance of {@link PCEHRHeader.User }
     * 
     * @return newly created instance
     */
    public PCEHRHeader.User createPCEHRHeaderUser() {
        return new PCEHRHeader.User();
    }

    /**
     * Create an instance of {@link OrganisationType }
     * 
     * @return newly created instance
     */
    public OrganisationType createOrganisationType() {
        return new OrganisationType();
    }

    /**
     * Create an instance of {@link PCEHRHeader.ProductType }
     * 
     * @return newly created instance
     */
    public PCEHRHeader.ProductType createPCEHRHeaderProductType() {
        return new PCEHRHeader.ProductType();
    }

    /**
     * Create an instance of {@link PCEHRHeader.AccessingOrganisation }
     * 
     * @return newly created instance
     */
    public PCEHRHeader.AccessingOrganisation createPCEHRHeaderAccessingOrganisation() {
        return new PCEHRHeader.AccessingOrganisation();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     * @return newly created instance
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link PCEHRMobileHeader }
     * 
     * @return newly created instance
     */
    public PCEHRMobileHeader createPCEHRMobileHeader() {
        return new PCEHRMobileHeader();
    }

    /**
     * Create an instance of {@link Signature }
     * 
     * @return newly created instance
     */
    public Signature createSignature() {
        return new Signature();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     * @return newly created instance
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link AccessedEntityType }
     * 
     * @return newly created instance
     */
    public AccessedEntityType createAccessedEntityType() {
        return new AccessedEntityType();
    }

    /**
     * Create an instance of {@link ParticipantDetailsType }
     * 
     * @return newly created instance
     */
    public ParticipantDetailsType createParticipantDetailsType() {
        return new ParticipantDetailsType();
    }

    /**
     * Create an instance of {@link ResponseStatusType }
     * 
     * @return newly created instance
     */
    public ResponseStatusType createResponseStatusType() {
        return new ResponseStatusType();
    }

    /**
     * Create an instance of {@link AddressType.PostalDeliveryGroup }
     * 
     * @return newly created instance
     */
    public AddressType.PostalDeliveryGroup createAddressTypePostalDeliveryGroup() {
        return new AddressType.PostalDeliveryGroup();
    }

    /**
     * Create an instance of {@link AddressType.UnitGroup }
     * 
     * @return newly created instance
     */
    public AddressType.UnitGroup createAddressTypeUnitGroup() {
        return new AddressType.UnitGroup();
    }

    /**
     * Create an instance of {@link AddressType.LevelGroup }
     * 
     * @return newly created instance
     */
    public AddressType.LevelGroup createAddressTypeLevelGroup() {
        return new AddressType.LevelGroup();
    }

    /**
     * Create an instance of {@link OrganisationType.ParticipatingOrganisation }
     * 
     * @return newly created instance
     */
    public OrganisationType.ParticipatingOrganisation createOrganisationTypeParticipatingOrganisation() {
        return new OrganisationType.ParticipatingOrganisation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "dvaFileNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDvaFileNumber(String value) {
        return new JAXBElement<String>(_DvaFileNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sex }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "sex")
    public JAXBElement<Sex> createSex(Sex value) {
        return new JAXBElement<Sex>(_Sex_QNAME, Sex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "ihiNumber")
    public JAXBElement<String> createIhiNumber(String value) {
        return new JAXBElement<String>(_IhiNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "medicareCardNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMedicareCardNumber(String value) {
        return new JAXBElement<String>(_MedicareCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateAccuracyIndicatorType }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "dateAccuracyIndicatorType")
    public JAXBElement<DateAccuracyIndicatorType> createDateAccuracyIndicatorType(DateAccuracyIndicatorType value) {
        return new JAXBElement<DateAccuracyIndicatorType>(_DateAccuracyIndicatorType_QNAME, DateAccuracyIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "medicareIRN")
    public JAXBElement<Integer> createMedicareIRN(Integer value) {
        return new JAXBElement<Integer>(_MedicareIRN_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }&gt;}
     * 
     * @param value field value
     * @return newly created instance
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "militaryHealthNumber")
    public JAXBElement<String> createMilitaryHealthNumber(String value) {
        return new JAXBElement<String>(_MilitaryHealthNumber_QNAME, String.class, null, value);
    }

}
