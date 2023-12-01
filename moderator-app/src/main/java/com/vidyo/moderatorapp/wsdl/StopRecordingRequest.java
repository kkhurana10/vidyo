
package com.vidyo.moderatorapp.wsdl;

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
 *         <element name="recorderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "recorderID",
    "moderatorPIN"
})
@XmlRootElement(name = "StopRecordingRequest")
public class StopRecordingRequest {

    @XmlElement(required = true)
    protected String conferenceID;
    protected int recorderID;
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
     * Gets the value of the recorderID property.
     * 
     */
    public int getRecorderID() {
        return recorderID;
    }

    /**
     * Sets the value of the recorderID property.
     * 
     */
    public void setRecorderID(int value) {
        this.recorderID = value;
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
