
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
 *         <element name="conferenceID" type="{http://portal.vidyo.com/user/v1_1}EntityID"/>
 *         <element name="recorderPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="webcast" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="moderatorPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "conferenceID",
    "recorderPrefix",
    "webcast",
    "moderatorPIN"
})
@XmlRootElement(name = "StartRecordingRequest")
public class StartRecordingRequest {

    @XmlElement(required = true)
    protected String conferenceID;
    @XmlElement(required = true)
    protected String recorderPrefix;
    protected boolean webcast;
    @XmlElementRef(name = "moderatorPIN", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moderatorPIN;

    /**
     * Gets the value of the conferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceID() {
        return conferenceID;
    }

    /**
     * Sets the value of the conferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceID(String value) {
        this.conferenceID = value;
    }

    /**
     * Gets the value of the recorderPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecorderPrefix() {
        return recorderPrefix;
    }

    /**
     * Sets the value of the recorderPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecorderPrefix(String value) {
        this.recorderPrefix = value;
    }

    /**
     * Gets the value of the webcast property.
     * 
     */
    public boolean isWebcast() {
        return webcast;
    }

    /**
     * Sets the value of the webcast property.
     * 
     */
    public void setWebcast(boolean value) {
        this.webcast = value;
    }

    /**
     * Gets the value of the moderatorPIN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModeratorPIN() {
        return moderatorPIN;
    }

    /**
     * Sets the value of the moderatorPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModeratorPIN(JAXBElement<String> value) {
        this.moderatorPIN = value;
    }

}
