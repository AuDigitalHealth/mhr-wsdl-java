
package au.net.electronichealth.ns.mhr.xsd.interfaces.registermhr._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.net.electronichealth.ns.mhr.xsd.common.commoncoreelements._1.ContactDetailsType;
import au.net.electronichealth.ns.mhr.xsd.common.commoncoreelements._1.IndividualTypeSupp;


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
 *         &lt;element name="representative" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber" minOccurs="0"/&gt;
 *                   &lt;element name="demographics" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="individual" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="demographics"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="assertions"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="identity"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="evidenceOfIdentity"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod1"/&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod2"/&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod3"/&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod4"/&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod5"/&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod6"/&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod7"/&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod8"/&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod9"/&gt;
 *                                             &lt;enumeration value="IdentityVerificationMethod10"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="indigenousStatus"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                   &lt;enumeration value="9"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="signedConsentForm" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="documentConsent" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="document" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="MBS"/&gt;
 *                                             &lt;enumeration value="ACIR"/&gt;
 *                                             &lt;enumeration value="AODR"/&gt;
 *                                             &lt;enumeration value="PBSPastAssimilation"/&gt;
 *                                             &lt;enumeration value="MBSPastAssimilation"/&gt;
 *                                             &lt;enumeration value="PBS"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="status"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="ConsentGiven"/&gt;
 *                                             &lt;enumeration value="ConsentNotGiven"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ivcCorrespondence"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="channel"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="email"/&gt;
 *                                   &lt;enumeration value="sms"/&gt;
 *                                   &lt;enumeration value="response"/&gt;
 *                                   &lt;enumeration value="mail"/&gt;
 *                                   &lt;enumeration value="none"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="acceptedTermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="representativeDeclaration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "", propOrder = {
    "representative",
    "individual",
    "assertions"
})
@XmlRootElement(name = "registerPCEHR")
public class RegisterMHR {

    protected RegisterMHR.Representative representative;
    protected RegisterMHR.Individual individual;
    @XmlElement(required = true)
    protected RegisterMHR.Assertions assertions;

    /**
     * Gets the value of the representative property.
     * 
     * @return the result
     *     possible object is
     *     {@link RegisterMHR.Representative }
     *     
     */
    public RegisterMHR.Representative getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link RegisterMHR.Representative }
     *     
     */
    public void setRepresentative(RegisterMHR.Representative value) {
        this.representative = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return the result
     *     possible object is
     *     {@link RegisterMHR.Individual }
     *     
     */
    public RegisterMHR.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link RegisterMHR.Individual }
     *     
     */
    public void setIndividual(RegisterMHR.Individual value) {
        this.individual = value;
    }

    /**
     * Gets the value of the assertions property.
     * 
     * @return the result
     *     possible object is
     *     {@link RegisterMHR.Assertions }
     *     
     */
    public RegisterMHR.Assertions getAssertions() {
        return assertions;
    }

    /**
     * Sets the value of the assertions property.
     * 
     * @param value field value
     *     allowed object is
     *     {@link RegisterMHR.Assertions }
     *     
     */
    public void setAssertions(RegisterMHR.Assertions value) {
        this.assertions = value;
    }


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
     *         &lt;element name="identity"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="evidenceOfIdentity"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod1"/&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod2"/&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod3"/&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod4"/&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod5"/&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod6"/&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod7"/&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod8"/&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod9"/&gt;
     *                                   &lt;enumeration value="IdentityVerificationMethod10"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="indigenousStatus"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                         &lt;enumeration value="4"/&gt;
     *                         &lt;enumeration value="9"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="signedConsentForm" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="documentConsent" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="document" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="MBS"/&gt;
     *                                   &lt;enumeration value="ACIR"/&gt;
     *                                   &lt;enumeration value="AODR"/&gt;
     *                                   &lt;enumeration value="PBSPastAssimilation"/&gt;
     *                                   &lt;enumeration value="MBSPastAssimilation"/&gt;
     *                                   &lt;enumeration value="PBS"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="status"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="ConsentGiven"/&gt;
     *                                   &lt;enumeration value="ConsentNotGiven"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ivcCorrespondence"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="channel"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="email"/&gt;
     *                         &lt;enumeration value="sms"/&gt;
     *                         &lt;enumeration value="response"/&gt;
     *                         &lt;enumeration value="mail"/&gt;
     *                         &lt;enumeration value="none"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="acceptedTermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="representativeDeclaration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "identity",
        "documentConsent",
        "ivcCorrespondence",
        "acceptedTermsAndConditions",
        "representativeDeclaration"
    })
    public static class Assertions {

        @XmlElement(required = true)
        protected RegisterMHR.Assertions.Identity identity;
        protected RegisterMHR.Assertions.DocumentConsent documentConsent;
        @XmlElement(required = true)
        protected RegisterMHR.Assertions.IvcCorrespondence ivcCorrespondence;
        protected boolean acceptedTermsAndConditions;
        protected Boolean representativeDeclaration;

        /**
         * Gets the value of the identity property.
         * 
         * @return the result
         *     possible object is
         *     {@link RegisterMHR.Assertions.Identity }
         *     
         */
        public RegisterMHR.Assertions.Identity getIdentity() {
            return identity;
        }

        /**
         * Sets the value of the identity property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link RegisterMHR.Assertions.Identity }
         *     
         */
        public void setIdentity(RegisterMHR.Assertions.Identity value) {
            this.identity = value;
        }

        /**
         * Gets the value of the documentConsent property.
         * 
         * @return the result
         *     possible object is
         *     {@link RegisterMHR.Assertions.DocumentConsent }
         *     
         */
        public RegisterMHR.Assertions.DocumentConsent getDocumentConsent() {
            return documentConsent;
        }

        /**
         * Sets the value of the documentConsent property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link RegisterMHR.Assertions.DocumentConsent }
         *     
         */
        public void setDocumentConsent(RegisterMHR.Assertions.DocumentConsent value) {
            this.documentConsent = value;
        }

        /**
         * Gets the value of the ivcCorrespondence property.
         * 
         * @return the result
         *     possible object is
         *     {@link RegisterMHR.Assertions.IvcCorrespondence }
         *     
         */
        public RegisterMHR.Assertions.IvcCorrespondence getIvcCorrespondence() {
            return ivcCorrespondence;
        }

        /**
         * Sets the value of the ivcCorrespondence property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link RegisterMHR.Assertions.IvcCorrespondence }
         *     
         */
        public void setIvcCorrespondence(RegisterMHR.Assertions.IvcCorrespondence value) {
            this.ivcCorrespondence = value;
        }

        /**
         * Gets the value of the acceptedTermsAndConditions property.
         * 
         * @return field value
         */
        public boolean isAcceptedTermsAndConditions() {
            return acceptedTermsAndConditions;
        }

        /**
         * Sets the value of the acceptedTermsAndConditions property.
         * 
         * @param value field value
         */
        public void setAcceptedTermsAndConditions(boolean value) {
            this.acceptedTermsAndConditions = value;
        }

        /**
         * Gets the value of the representativeDeclaration property.
         * 
         * @return the result
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRepresentativeDeclaration() {
            return representativeDeclaration;
        }

        /**
         * Sets the value of the representativeDeclaration property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRepresentativeDeclaration(Boolean value) {
            this.representativeDeclaration = value;
        }


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
         *         &lt;element name="document" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="MBS"/&gt;
         *                         &lt;enumeration value="ACIR"/&gt;
         *                         &lt;enumeration value="AODR"/&gt;
         *                         &lt;enumeration value="PBSPastAssimilation"/&gt;
         *                         &lt;enumeration value="MBSPastAssimilation"/&gt;
         *                         &lt;enumeration value="PBS"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="status"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="ConsentGiven"/&gt;
         *                         &lt;enumeration value="ConsentNotGiven"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
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
        @XmlType(name = "", propOrder = {
            "documents"
        })
        public static class DocumentConsent {

            @XmlElement(name = "document", required = true)
            protected List<RegisterMHR.Assertions.DocumentConsent.Document> documents;

            /**
             * Gets the value of the documents property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the documents property.
             * 
             * <p>For example, to add a new item, do as follows:
             * <pre>
             *    getDocuments().add(newItem);
             * </pre>
             * 
             * 
             * <p>Objects of the following type(s) are allowed in the list
             * {@link RegisterMHR.Assertions.DocumentConsent.Document }
             * 
             * 
             * @return field value
             */
            public List<RegisterMHR.Assertions.DocumentConsent.Document> getDocuments() {
                if (documents == null) {
                    documents = new ArrayList<RegisterMHR.Assertions.DocumentConsent.Document>();
                }
                return this.documents;
            }


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
             *         &lt;element name="type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="MBS"/&gt;
             *               &lt;enumeration value="ACIR"/&gt;
             *               &lt;enumeration value="AODR"/&gt;
             *               &lt;enumeration value="PBSPastAssimilation"/&gt;
             *               &lt;enumeration value="MBSPastAssimilation"/&gt;
             *               &lt;enumeration value="PBS"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="status"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="ConsentGiven"/&gt;
             *               &lt;enumeration value="ConsentNotGiven"/&gt;
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
            @XmlType(name = "", propOrder = {
                "type",
                "status"
            })
            public static class Document {

                @XmlElement(required = true)
                protected String type;
                @XmlElement(required = true)
                protected String status;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return the result
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value field value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return the result
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value field value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
                }

            }

        }


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
         *         &lt;element name="evidenceOfIdentity"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod1"/&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod2"/&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod3"/&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod4"/&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod5"/&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod6"/&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod7"/&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod8"/&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod9"/&gt;
         *                         &lt;enumeration value="IdentityVerificationMethod10"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="indigenousStatus"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *               &lt;enumeration value="4"/&gt;
         *               &lt;enumeration value="9"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="signedConsentForm" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
            "evidenceOfIdentity",
            "indigenousStatus",
            "signedConsentForm"
        })
        public static class Identity {

            @XmlElement(required = true)
            protected RegisterMHR.Assertions.Identity.EvidenceOfIdentity evidenceOfIdentity;
            @XmlElement(required = true)
            protected String indigenousStatus;
            protected byte[] signedConsentForm;

            /**
             * Gets the value of the evidenceOfIdentity property.
             * 
             * @return the result
             *     possible object is
             *     {@link RegisterMHR.Assertions.Identity.EvidenceOfIdentity }
             *     
             */
            public RegisterMHR.Assertions.Identity.EvidenceOfIdentity getEvidenceOfIdentity() {
                return evidenceOfIdentity;
            }

            /**
             * Sets the value of the evidenceOfIdentity property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link RegisterMHR.Assertions.Identity.EvidenceOfIdentity }
             *     
             */
            public void setEvidenceOfIdentity(RegisterMHR.Assertions.Identity.EvidenceOfIdentity value) {
                this.evidenceOfIdentity = value;
            }

            /**
             * Gets the value of the indigenousStatus property.
             * 
             * @return the result
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndigenousStatus() {
                return indigenousStatus;
            }

            /**
             * Sets the value of the indigenousStatus property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndigenousStatus(String value) {
                this.indigenousStatus = value;
            }

            /**
             * Gets the value of the signedConsentForm property.
             * 
             * @return the result
             *     possible object is
             *     byte[]
             */
            public byte[] getSignedConsentForm() {
                return signedConsentForm;
            }

            /**
             * Sets the value of the signedConsentForm property.
             * 
             * @param value field value
             *     allowed object is
             *     byte[]
             */
            public void setSignedConsentForm(byte[] value) {
                this.signedConsentForm = value;
            }


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
             *         &lt;element name="type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="IdentityVerificationMethod1"/&gt;
             *               &lt;enumeration value="IdentityVerificationMethod2"/&gt;
             *               &lt;enumeration value="IdentityVerificationMethod3"/&gt;
             *               &lt;enumeration value="IdentityVerificationMethod4"/&gt;
             *               &lt;enumeration value="IdentityVerificationMethod5"/&gt;
             *               &lt;enumeration value="IdentityVerificationMethod6"/&gt;
             *               &lt;enumeration value="IdentityVerificationMethod7"/&gt;
             *               &lt;enumeration value="IdentityVerificationMethod8"/&gt;
             *               &lt;enumeration value="IdentityVerificationMethod9"/&gt;
             *               &lt;enumeration value="IdentityVerificationMethod10"/&gt;
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
            @XmlType(name = "", propOrder = {
                "type"
            })
            public static class EvidenceOfIdentity {

                @XmlElement(required = true)
                protected String type;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return the result
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value field value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }


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
         *         &lt;element name="channel"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="email"/&gt;
         *               &lt;enumeration value="sms"/&gt;
         *               &lt;enumeration value="response"/&gt;
         *               &lt;enumeration value="mail"/&gt;
         *               &lt;enumeration value="none"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/&gt;
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
            "channel",
            "contactDetails"
        })
        public static class IvcCorrespondence {

            @XmlElement(required = true)
            protected String channel;
            protected ContactDetailsType contactDetails;

            /**
             * Gets the value of the channel property.
             * 
             * @return the result
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChannel() {
                return channel;
            }

            /**
             * Sets the value of the channel property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChannel(String value) {
                this.channel = value;
            }

            /**
             * Gets the value of the contactDetails property.
             * 
             * @return the result
             *     possible object is
             *     {@link ContactDetailsType }
             *     
             */
            public ContactDetailsType getContactDetails() {
                return contactDetails;
            }

            /**
             * Sets the value of the contactDetails property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link ContactDetailsType }
             *     
             */
            public void setContactDetails(ContactDetailsType value) {
                this.contactDetails = value;
            }

        }

    }


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
     *         &lt;element name="demographics"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "demographics"
    })
    public static class Individual {

        @XmlElement(required = true)
        protected RegisterMHR.Individual.Demographics demographics;

        /**
         * Gets the value of the demographics property.
         * 
         * @return the result
         *     possible object is
         *     {@link RegisterMHR.Individual.Demographics }
         *     
         */
        public RegisterMHR.Individual.Demographics getDemographics() {
            return demographics;
        }

        /**
         * Sets the value of the demographics property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link RegisterMHR.Individual.Demographics }
         *     
         */
        public void setDemographics(RegisterMHR.Individual.Demographics value) {
            this.demographics = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/&gt;
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/&gt;
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/&gt;
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "medicareCardNumber",
            "medicareIRN",
            "dvaFileNumber",
            "militaryHealthNumber"
        })
        public static class Demographics
            extends IndividualTypeSupp
        {

            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String medicareCardNumber;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            protected Integer medicareIRN;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String dvaFileNumber;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            protected String militaryHealthNumber;

            /**
             * Gets the value of the medicareCardNumber property.
             * 
             * @return the result
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicareCardNumber() {
                return medicareCardNumber;
            }

            /**
             * Sets the value of the medicareCardNumber property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicareCardNumber(String value) {
                this.medicareCardNumber = value;
            }

            /**
             * Gets the value of the medicareIRN property.
             * 
             * @return the result
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMedicareIRN() {
                return medicareIRN;
            }

            /**
             * Sets the value of the medicareIRN property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMedicareIRN(Integer value) {
                this.medicareIRN = value;
            }

            /**
             * Gets the value of the dvaFileNumber property.
             * 
             * @return the result
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDvaFileNumber() {
                return dvaFileNumber;
            }

            /**
             * Sets the value of the dvaFileNumber property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDvaFileNumber(String value) {
                this.dvaFileNumber = value;
            }

            /**
             * Gets the value of the militaryHealthNumber property.
             * 
             * @return the result
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMilitaryHealthNumber() {
                return militaryHealthNumber;
            }

            /**
             * Sets the value of the militaryHealthNumber property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMilitaryHealthNumber(String value) {
                this.militaryHealthNumber = value;
            }

        }

    }


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
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber" minOccurs="0"/&gt;
     *         &lt;element name="demographics" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "ihiNumber",
        "demographics"
    })
    public static class Representative {

        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
        protected String ihiNumber;
        protected RegisterMHR.Representative.Demographics demographics;

        /**
         * Gets the value of the ihiNumber property.
         * 
         * @return the result
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIhiNumber() {
            return ihiNumber;
        }

        /**
         * Sets the value of the ihiNumber property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIhiNumber(String value) {
            this.ihiNumber = value;
        }

        /**
         * Gets the value of the demographics property.
         * 
         * @return the result
         *     possible object is
         *     {@link RegisterMHR.Representative.Demographics }
         *     
         */
        public RegisterMHR.Representative.Demographics getDemographics() {
            return demographics;
        }

        /**
         * Sets the value of the demographics property.
         * 
         * @param value field value
         *     allowed object is
         *     {@link RegisterMHR.Representative.Demographics }
         *     
         */
        public void setDemographics(RegisterMHR.Representative.Demographics value) {
            this.demographics = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/&gt;
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/&gt;
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/&gt;
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "medicareCardNumber",
            "medicareIRN",
            "dvaFileNumber",
            "militaryHealthNumber"
        })
        public static class Demographics
            extends IndividualTypeSupp
        {

            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String medicareCardNumber;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            protected Integer medicareIRN;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String dvaFileNumber;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            protected String militaryHealthNumber;

            /**
             * Gets the value of the medicareCardNumber property.
             * 
             * @return the result
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicareCardNumber() {
                return medicareCardNumber;
            }

            /**
             * Sets the value of the medicareCardNumber property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicareCardNumber(String value) {
                this.medicareCardNumber = value;
            }

            /**
             * Gets the value of the medicareIRN property.
             * 
             * @return the result
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMedicareIRN() {
                return medicareIRN;
            }

            /**
             * Sets the value of the medicareIRN property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMedicareIRN(Integer value) {
                this.medicareIRN = value;
            }

            /**
             * Gets the value of the dvaFileNumber property.
             * 
             * @return the result
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDvaFileNumber() {
                return dvaFileNumber;
            }

            /**
             * Sets the value of the dvaFileNumber property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDvaFileNumber(String value) {
                this.dvaFileNumber = value;
            }

            /**
             * Gets the value of the militaryHealthNumber property.
             * 
             * @return the result
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMilitaryHealthNumber() {
                return militaryHealthNumber;
            }

            /**
             * Sets the value of the militaryHealthNumber property.
             * 
             * @param value field value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMilitaryHealthNumber(String value) {
                this.militaryHealthNumber = value;
            }

        }

    }

}
