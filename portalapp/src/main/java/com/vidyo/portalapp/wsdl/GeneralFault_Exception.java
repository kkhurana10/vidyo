
package com.vidyo.portalapp.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "GeneralFault", targetNamespace = "http://portal.vidyo.com/user/v1_1")
public class GeneralFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GeneralFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public GeneralFault_Exception(String message, GeneralFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public GeneralFault_Exception(String message, GeneralFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vidyo.portalapp.wsdl.GeneralFault
     */
    public GeneralFault getFaultInfo() {
        return faultInfo;
    }

}
