
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
 *         <element name="authToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="jwtToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refreshToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "authToken",
    "jwtToken",
    "refreshToken"
})
@XmlRootElement(name = "GenerateAuthTokenResponse")
public class GenerateAuthTokenResponse {

    @XmlElement(required = true)
    protected String authToken;
    protected String jwtToken;
    protected String refreshToken;

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

    /**
     * Gets the value of the jwtToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJwtToken() {
        return jwtToken;
    }

    /**
     * Sets the value of the jwtToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJwtToken(String value) {
        this.jwtToken = value;
    }

    /**
     * Gets the value of the refreshToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Sets the value of the refreshToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshToken(String value) {
        this.refreshToken = value;
    }

}
