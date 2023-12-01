
package com.vidyo.portalapp.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}ErrorMessage"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}RetryAfter" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorMessage",
    "retryAfter"
})
@XmlRootElement(name = "ResourceNotAvailableFault")
public class ResourceNotAvailableFault {

    /**
     * String presentation of fault
     * 
     */
    @XmlElement(name = "ErrorMessage", required = true)
    protected String errorMessage;
    /**
     * This element is a suggested minimum duration in milliseconds to wait before retransmitting the
     * 						message
     * 
     */
    @XmlElement(name = "RetryAfter")
    protected Integer retryAfter;

    /**
     * String presentation of fault
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErrorMessage()
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * This element is a suggested minimum duration in milliseconds to wait before retransmitting the
     * 						message
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetryAfter() {
        return retryAfter;
    }

    /**
     * Sets the value of the retryAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getRetryAfter()
     */
    public void setRetryAfter(Integer value) {
        this.retryAfter = value;
    }

}
