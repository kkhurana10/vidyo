
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
 *         <element name="EID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vrIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="applicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="applicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="applicationOs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deviceModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pak2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "eid",
    "vrIP",
    "clientType",
    "applicationName",
    "applicationVersion",
    "applicationOs",
    "deviceModel",
    "pak2"
})
@XmlRootElement(name = "LinkEndpointRequest")
public class LinkEndpointRequest {

    @XmlElement(name = "EID", required = true)
    protected String eid;
    protected String vrIP;
    protected String clientType;
    protected String applicationName;
    protected String applicationVersion;
    protected String applicationOs;
    protected String deviceModel;
    protected Boolean pak2;

    /**
     * Gets the value of the eid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEID() {
        return eid;
    }

    /**
     * Sets the value of the eid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEID(String value) {
        this.eid = value;
    }

    /**
     * Gets the value of the vrIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrIP() {
        return vrIP;
    }

    /**
     * Sets the value of the vrIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrIP(String value) {
        this.vrIP = value;
    }

    /**
     * Gets the value of the clientType property.
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
     */
    public void setClientType(String value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the applicationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * Sets the value of the applicationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationVersion(String value) {
        this.applicationVersion = value;
    }

    /**
     * Gets the value of the applicationOs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationOs() {
        return applicationOs;
    }

    /**
     * Sets the value of the applicationOs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationOs(String value) {
        this.applicationOs = value;
    }

    /**
     * Gets the value of the deviceModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModel() {
        return deviceModel;
    }

    /**
     * Sets the value of the deviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModel(String value) {
        this.deviceModel = value;
    }

    /**
     * Gets the value of the pak2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPak2() {
        return pak2;
    }

    /**
     * Sets the value of the pak2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPak2(Boolean value) {
        this.pak2 = value;
    }

}
