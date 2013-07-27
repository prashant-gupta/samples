
package edu.jft.prashant.wsendpoints;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.jft.prashant.wsendpoints package. 
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

    private final static QName _EchoUsernameResponse_QNAME = new QName("http://wsendpoints.prashant.jft.edu/", "echoUsernameResponse");
    private final static QName _EchoUsername_QNAME = new QName("http://wsendpoints.prashant.jft.edu/", "echoUsername");
    private final static QName _GetUsernameResponse_QNAME = new QName("http://wsendpoints.prashant.jft.edu/", "getUsernameResponse");
    private final static QName _GetUsername_QNAME = new QName("http://wsendpoints.prashant.jft.edu/", "getUsername");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.jft.prashant.wsendpoints
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link edu.jft.prashant.wsendpoints.EchoUsername }
     * 
     */
    public EchoUsername createEchoUsername() {
        return new EchoUsername();
    }

    /**
     * Create an instance of {@link edu.jft.prashant.wsendpoints.GetUsername }
     * 
     */
    public GetUsername createGetUsername() {
        return new GetUsername();
    }

    /**
     * Create an instance of {@link edu.jft.prashant.wsendpoints.EchoUsernameResponse }
     * 
     */
    public EchoUsernameResponse createEchoUsernameResponse() {
        return new EchoUsernameResponse();
    }

    /**
     * Create an instance of {@link edu.jft.prashant.wsendpoints.GetUsernameResponse }
     * 
     */
    public GetUsernameResponse createGetUsernameResponse() {
        return new GetUsernameResponse();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link edu.jft.prashant.wsendpoints.EchoUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsendpoints.prashant.jft.edu/", name = "echoUsernameResponse")
    public JAXBElement<EchoUsernameResponse> createEchoUsernameResponse(EchoUsernameResponse value) {
        return new JAXBElement<EchoUsernameResponse>(_EchoUsernameResponse_QNAME, EchoUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link edu.jft.prashant.wsendpoints.EchoUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsendpoints.prashant.jft.edu/", name = "echoUsername")
    public JAXBElement<EchoUsername> createEchoUsername(EchoUsername value) {
        return new JAXBElement<EchoUsername>(_EchoUsername_QNAME, EchoUsername.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link edu.jft.prashant.wsendpoints.GetUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsendpoints.prashant.jft.edu/", name = "getUsernameResponse")
    public JAXBElement<GetUsernameResponse> createGetUsernameResponse(GetUsernameResponse value) {
        return new JAXBElement<GetUsernameResponse>(_GetUsernameResponse_QNAME, GetUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link edu.jft.prashant.wsendpoints.GetUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsendpoints.prashant.jft.edu/", name = "getUsername")
    public JAXBElement<GetUsername> createGetUsername(GetUsername value) {
        return new JAXBElement<GetUsername>(_GetUsername_QNAME, GetUsername.class, null, value);
    }

}
