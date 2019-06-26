
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _VueltoResponse_QNAME = new QName("http://ws/", "vueltoResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _Vuelto_QNAME = new QName("http://ws/", "vuelto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VueltoResponse }
     * 
     */
    public VueltoResponse createVueltoResponse() {
        return new VueltoResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Vuelto }
     * 
     */
    public Vuelto createVuelto() {
        return new Vuelto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VueltoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "vueltoResponse")
    public JAXBElement<VueltoResponse> createVueltoResponse(VueltoResponse value) {
        return new JAXBElement<VueltoResponse>(_VueltoResponse_QNAME, VueltoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vuelto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "vuelto")
    public JAXBElement<Vuelto> createVuelto(Vuelto value) {
        return new JAXBElement<Vuelto>(_Vuelto_QNAME, Vuelto.class, null, value);
    }

}
