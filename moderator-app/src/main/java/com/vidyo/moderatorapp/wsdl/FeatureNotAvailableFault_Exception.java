
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "FeatureNotAvailableFault", targetNamespace = "http://portal.vidyo.com/user/v1_1")
public class FeatureNotAvailableFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FeatureNotAvailableFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public FeatureNotAvailableFault_Exception(String message, FeatureNotAvailableFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public FeatureNotAvailableFault_Exception(String message, FeatureNotAvailableFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vidyo.moderatorapp.wsdl.FeatureNotAvailableFault
     */
    public FeatureNotAvailableFault getFaultInfo() {
        return faultInfo;
    }

}