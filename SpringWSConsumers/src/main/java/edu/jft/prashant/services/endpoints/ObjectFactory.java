
package edu.jft.prashant.services.endpoints;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.jft.prashant.services.endpoints package. 
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

    private final static QName _Echo_QNAME = new QName("http://endpoints.services.prashant.jft.edu/", "echo");
    private final static QName _EchoResponse_QNAME = new QName("http://endpoints.services.prashant.jft.edu/", "echoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.jft.prashant.services.endpoints
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link edu.jft.prashant.services.endpoints.EchoResponse }
     * 
     */
    public EchoResponse createEchoResponse() {
        return new EchoResponse();
    }

    /**
     * Create an instance of {@link edu.jft.prashant.services.endpoints.Echo }
     * 
     */
    public Echo createEcho() {
        return new Echo();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link edu.jft.prashant.services.endpoints.Echo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.services.prashant.jft.edu/", name = "echo")
    public JAXBElement<Echo> createEcho(Echo value) {
        return new JAXBElement<Echo>(_Echo_QNAME, Echo.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link edu.jft.prashant.services.endpoints.EchoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.services.prashant.jft.edu/", name = "echoResponse")
    public JAXBElement<EchoResponse> createEchoResponse(EchoResponse value) {
        return new JAXBElement<EchoResponse>(_EchoResponse_QNAME, EchoResponse.class, null, value);
    }

}
