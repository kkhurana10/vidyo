
package com.vidyo.portalapp.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         <element ref="{http://portal.vidyo.com/user/v1_1}ClientType" minOccurs="0"/>
 *         <element name="returnEndpointBehavior" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="returnAuthToken" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="returnPortalVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="returnServiceAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="returnNeoRoomPermanentPairingDeviceUserAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="returnUserRole" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="returnJwtTokens" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="endpointGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "clientType",
    "returnEndpointBehavior",
    "returnAuthToken",
    "returnPortalVersion",
    "returnServiceAddress",
    "returnNeoRoomPermanentPairingDeviceUserAttribute",
    "returnUserRole",
    "returnJwtTokens",
    "endpointGuid"
})
@XmlRootElement(name = "LogInRequest")
public class LogInRequest {

    /**
     * Type is 'W' for Windows platform.
     * 						Type is 'M' for
     * 						MacOS platform.
     * 						Type is 'V' for VidyoRoom HD200 (Windows platform).
     * 						Type is 'R' for VidyoRoom HD100/HD50 (Windows platform).
     * 						Type is
     * 						'L' for Linux platform.
     * 						Type is 'S' for SL5 platform.
     * 						Type is 'U'
     * 						for Ubuntu platform.
     * 						Type is 'T' for SL5 64bit platform.
     * 						Type is 'X'
     * 						for Ubuntu 64bit platform.
     * 						Type is 'I' for iOS
     * 						Type is 'A' for
     * 						Android
     * 						Type is 'P' for VidyoPanorama VP600.
     * 						Type is 'N' for
     * 						VidyoPanorama 600 running Windows 64-bit.
     * 						Type is 'E'
     * 						for
     * 						VidyoPanorama 600 running Linux 32-bit.
     * 						Type is 'O' for
     * 						VidyoPanorama 600 running Linux 64-bit.
     * 						Type is 'Q' for VidyoRoom
     * 						running Windows 32-bit.
     * 						Type is 'Y' for VidyoRoom running Windows
     * 						64-bit.
     * 						Type is 'F' for
     * 						VidyoRoom running Linux 32-bit.
     * 						Type is 'Z'
     * 						for VidyoRoom running Linux 64-bit.
     * 						Type is 'B' for VidyoRoom SE
     * 						Windows.
     * 						Type is 'C' for VidyoRoom SE Linux.
     * 						Type is 'D' for
     * 						VidyoRoom SE OS X.
     * 						Type is 'G' for VidyoConnectRoom on Windows.
     * 
     */
    @XmlElement(name = "ClientType")
    protected String clientType;
    @XmlElement(defaultValue = "false")
    protected Boolean returnEndpointBehavior;
    @XmlElement(defaultValue = "false")
    protected Boolean returnAuthToken;
    @XmlElement(defaultValue = "false")
    protected Boolean returnPortalVersion;
    @XmlElement(defaultValue = "false")
    protected Boolean returnServiceAddress;
    @XmlElement(defaultValue = "false")
    protected Boolean returnNeoRoomPermanentPairingDeviceUserAttribute;
    @XmlElement(defaultValue = "false")
    protected Boolean returnUserRole;
    @XmlElement(defaultValue = "false")
    protected Boolean returnJwtTokens;
    @XmlElementRef(name = "endpointGuid", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endpointGuid;

    /**
     * Type is 'W' for Windows platform.
     * 						Type is 'M' for
     * 						MacOS platform.
     * 						Type is 'V' for VidyoRoom HD200 (Windows platform).
     * 						Type is 'R' for VidyoRoom HD100/HD50 (Windows platform).
     * 						Type is
     * 						'L' for Linux platform.
     * 						Type is 'S' for SL5 platform.
     * 						Type is 'U'
     * 						for Ubuntu platform.
     * 						Type is 'T' for SL5 64bit platform.
     * 						Type is 'X'
     * 						for Ubuntu 64bit platform.
     * 						Type is 'I' for iOS
     * 						Type is 'A' for
     * 						Android
     * 						Type is 'P' for VidyoPanorama VP600.
     * 						Type is 'N' for
     * 						VidyoPanorama 600 running Windows 64-bit.
     * 						Type is 'E'
     * 						for
     * 						VidyoPanorama 600 running Linux 32-bit.
     * 						Type is 'O' for
     * 						VidyoPanorama 600 running Linux 64-bit.
     * 						Type is 'Q' for VidyoRoom
     * 						running Windows 32-bit.
     * 						Type is 'Y' for VidyoRoom running Windows
     * 						64-bit.
     * 						Type is 'F' for
     * 						VidyoRoom running Linux 32-bit.
     * 						Type is 'Z'
     * 						for VidyoRoom running Linux 64-bit.
     * 						Type is 'B' for VidyoRoom SE
     * 						Windows.
     * 						Type is 'C' for VidyoRoom SE Linux.
     * 						Type is 'D' for
     * 						VidyoRoom SE OS X.
     * 						Type is 'G' for VidyoConnectRoom on Windows.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getClientType()
     */
    public void setClientType(String value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the returnEndpointBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnEndpointBehavior() {
        return returnEndpointBehavior;
    }

    /**
     * Sets the value of the returnEndpointBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnEndpointBehavior(Boolean value) {
        this.returnEndpointBehavior = value;
    }

    /**
     * Gets the value of the returnAuthToken property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnAuthToken() {
        return returnAuthToken;
    }

    /**
     * Sets the value of the returnAuthToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnAuthToken(Boolean value) {
        this.returnAuthToken = value;
    }

    /**
     * Gets the value of the returnPortalVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnPortalVersion() {
        return returnPortalVersion;
    }

    /**
     * Sets the value of the returnPortalVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnPortalVersion(Boolean value) {
        this.returnPortalVersion = value;
    }

    /**
     * Gets the value of the returnServiceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnServiceAddress() {
        return returnServiceAddress;
    }

    /**
     * Sets the value of the returnServiceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnServiceAddress(Boolean value) {
        this.returnServiceAddress = value;
    }

    /**
     * Gets the value of the returnNeoRoomPermanentPairingDeviceUserAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnNeoRoomPermanentPairingDeviceUserAttribute() {
        return returnNeoRoomPermanentPairingDeviceUserAttribute;
    }

    /**
     * Sets the value of the returnNeoRoomPermanentPairingDeviceUserAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnNeoRoomPermanentPairingDeviceUserAttribute(Boolean value) {
        this.returnNeoRoomPermanentPairingDeviceUserAttribute = value;
    }

    /**
     * Gets the value of the returnUserRole property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnUserRole() {
        return returnUserRole;
    }

    /**
     * Sets the value of the returnUserRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnUserRole(Boolean value) {
        this.returnUserRole = value;
    }

    /**
     * Gets the value of the returnJwtTokens property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnJwtTokens() {
        return returnJwtTokens;
    }

    /**
     * Sets the value of the returnJwtTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnJwtTokens(Boolean value) {
        this.returnJwtTokens = value;
    }

    /**
     * Gets the value of the endpointGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndpointGuid() {
        return endpointGuid;
    }

    /**
     * Sets the value of the endpointGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndpointGuid(JAXBElement<String> value) {
        this.endpointGuid = value;
    }

}
