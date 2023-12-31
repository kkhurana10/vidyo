
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "SeatLicenseExpiredFault", targetNamespace = "http://portal.vidyo.com/user/v1_1")
public class SeatLicenseExpiredFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SeatLicenseExpiredFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SeatLicenseExpiredFault_Exception(String message, SeatLicenseExpiredFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public SeatLicenseExpiredFault_Exception(String message, SeatLicenseExpiredFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vidyo.moderatorapp.wsdl.SeatLicenseExpiredFault
     */
    public SeatLicenseExpiredFault getFaultInfo() {
        return faultInfo;
    }

}
