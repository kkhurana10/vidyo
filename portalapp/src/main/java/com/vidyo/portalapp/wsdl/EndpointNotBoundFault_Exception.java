
package com.vidyo.portalapp.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "EndpointNotBoundFault", targetNamespace = "http://portal.vidyo.com/user/v1_1")
public class EndpointNotBoundFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private EndpointNotBoundFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public EndpointNotBoundFault_Exception(String message, EndpointNotBoundFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public EndpointNotBoundFault_Exception(String message, EndpointNotBoundFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vidyo.portalapp.wsdl.EndpointNotBoundFault
     */
    public EndpointNotBoundFault getFaultInfo() {
        return faultInfo;
    }

}
