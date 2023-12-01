
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "InvalidConferenceFault", targetNamespace = "http://portal.vidyo.com/user/v1_1")
public class InvalidConferenceFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidConferenceFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidConferenceFault_Exception(String message, InvalidConferenceFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public InvalidConferenceFault_Exception(String message, InvalidConferenceFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vidyo.moderatorapp.wsdl.InvalidConferenceFault
     */
    public InvalidConferenceFault getFaultInfo() {
        return faultInfo;
    }

}
