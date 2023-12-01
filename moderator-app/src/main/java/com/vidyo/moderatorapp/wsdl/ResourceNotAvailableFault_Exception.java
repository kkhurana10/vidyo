
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "ResourceNotAvailableFault", targetNamespace = "http://portal.vidyo.com/user/v1_1")
public class ResourceNotAvailableFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ResourceNotAvailableFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ResourceNotAvailableFault_Exception(String message, ResourceNotAvailableFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public ResourceNotAvailableFault_Exception(String message, ResourceNotAvailableFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vidyo.moderatorapp.wsdl.ResourceNotAvailableFault
     */
    public ResourceNotAvailableFault getFaultInfo() {
        return faultInfo;
    }

}
