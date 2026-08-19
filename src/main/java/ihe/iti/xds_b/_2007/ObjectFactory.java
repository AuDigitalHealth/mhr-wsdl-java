
package ihe.iti.xds_b._2007;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ihe.iti.xds_b._2007 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ihe.iti.xds_b._2007
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveDocumentSetResponse }
     * 
     * @return newly created instance
     */
    public RetrieveDocumentSetResponse createRetrieveDocumentSetResponse() {
        return new RetrieveDocumentSetResponse();
    }

    /**
     * Create an instance of {@link RetrieveDocumentSetRequest }
     * 
     * @return newly created instance
     */
    public RetrieveDocumentSetRequest createRetrieveDocumentSetRequest() {
        return new RetrieveDocumentSetRequest();
    }

    /**
     * Create an instance of {@link ProvideAndRegisterDocumentSetRequest }
     * 
     * @return newly created instance
     */
    public ProvideAndRegisterDocumentSetRequest createProvideAndRegisterDocumentSetRequest() {
        return new ProvideAndRegisterDocumentSetRequest();
    }

    /**
     * Create an instance of {@link RetrieveDocumentSetResponse.DocumentResponse }
     * 
     * @return newly created instance
     */
    public RetrieveDocumentSetResponse.DocumentResponse createRetrieveDocumentSetResponseDocumentResponse() {
        return new RetrieveDocumentSetResponse.DocumentResponse();
    }

    /**
     * Create an instance of {@link RetrieveDocumentSetRequest.DocumentRequest }
     * 
     * @return newly created instance
     */
    public RetrieveDocumentSetRequest.DocumentRequest createRetrieveDocumentSetRequestDocumentRequest() {
        return new RetrieveDocumentSetRequest.DocumentRequest();
    }

    /**
     * Create an instance of {@link ProvideAndRegisterDocumentSetRequest.Document }
     * 
     * @return newly created instance
     */
    public ProvideAndRegisterDocumentSetRequest.Document createProvideAndRegisterDocumentSetRequestDocument() {
        return new ProvideAndRegisterDocumentSetRequest.Document();
    }

}
