/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;

/**
 *
 * @author mjara
 */
@WebService(serviceName = "PagoWS", portName = "PagoWSPort", endpointInterface = "ws.PagoWS", targetNamespace = "http://ws/", wsdlLocation = "WEB-INF/wsdl/PagoWS/localhost_8080/Pago/PagoWS.wsdl")
public class PagoWS {

    public int vuelto(int pagar, int total) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String hello(java.lang.String name) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
