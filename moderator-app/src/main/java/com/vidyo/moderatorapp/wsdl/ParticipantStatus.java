
package com.vidyo.moderatorapp.wsdl;

import java.math.BigInteger;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipantStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ParticipantStatus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="conferenceID" type="{http://portal.vidyo.com/user/v1_1}EntityID"/>
 *         <element name="participantID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         <element name="audio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="video" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="appshare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantStatus", propOrder = {
    "conferenceID",
    "participantID",
    "audio",
    "video",
    "appshare"
})
public class ParticipantStatus {

    @XmlElement(required = true)
    protected String conferenceID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger participantID;
    @XmlElementRef(name = "audio", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> audio;
    @XmlElementRef(name = "video", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> video;
    @XmlElementRef(name = "appshare", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> appshare;

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
     * Gets the value of the participantID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParticipantID() {
        return participantID;
    }

    /**
     * Sets the value of the participantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParticipantID(BigInteger value) {
        this.participantID = value;
    }

    /**
     * Gets the value of the audio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAudio() {
        return audio;
    }

    /**
     * Sets the value of the audio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAudio(JAXBElement<Boolean> value) {
        this.audio = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVideo(JAXBElement<Boolean> value) {
        this.video = value;
    }

    /**
     * Gets the value of the appshare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAppshare() {
        return appshare;
    }

    /**
     * Sets the value of the appshare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAppshare(JAXBElement<Boolean> value) {
        this.appshare = value;
    }

}
