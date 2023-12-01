
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
 *         <element name="entityID" type="{http://portal.vidyo.com/user/v1_1}EntityID"/>
 *         <element name="participantID" type="{http://portal.vidyo.com/user/v1_1}EntityID"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}EntityType"/>
 *         <element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="extension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="audio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="video" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="appshare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="handRaised" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="presenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "entityID",
    "participantID",
    "entityType",
    "displayName",
    "extension",
    "audio",
    "video",
    "appshare",
    "handRaised",
    "presenter"
})
@XmlRootElement(name = "LectureModeParticipant")
public class LectureModeParticipant {

    @XmlElement(required = true)
    protected String entityID;
    @XmlElement(required = true)
    protected String participantID;
    /**
     * There are three types of entities in VidyoPortal:
     * 						1. Member - A member is an authorized user of VidyoPortal with a
     * 						user account.
     * 						- A member may have at the most one personal room.
     * 						- A
     * 						member has a display name
     * 						- A member has an extension that can also
     * 						be used for search purposes.
     * 
     * 						2. Room - It is a meeting place. Rooms
     * 						are of two kinds:
     * 						- Personal, as explained above
     * 						- Public. Each room
     * 						has a owner assigned who can control the room.
     * 
     * 						3. Legacy - This
     * 						entity represents external endpoints. Think of it as a label to
     * 						identify and search external devices.
     * 						Legacy entity does not have
     * 						an account on the VidyoPortal. There is no owner assigned to
     * 						legacy devices.
     * 
     */
    @XmlElement(name = "EntityType", required = true)
    protected String entityType;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected String extension;
    @XmlElementRef(name = "audio", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> audio;
    @XmlElementRef(name = "video", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> video;
    @XmlElementRef(name = "appshare", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> appshare;
    @XmlElementRef(name = "handRaised", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handRaised;
    @XmlElementRef(name = "presenter", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> presenter;

    /**
     * Gets the value of the entityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityID(String value) {
        this.entityID = value;
    }

    /**
     * Gets the value of the participantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantID() {
        return participantID;
    }

    /**
     * Sets the value of the participantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantID(String value) {
        this.participantID = value;
    }

    /**
     * There are three types of entities in VidyoPortal:
     * 						1. Member - A member is an authorized user of VidyoPortal with a
     * 						user account.
     * 						- A member may have at the most one personal room.
     * 						- A
     * 						member has a display name
     * 						- A member has an extension that can also
     * 						be used for search purposes.
     * 
     * 						2. Room - It is a meeting place. Rooms
     * 						are of two kinds:
     * 						- Personal, as explained above
     * 						- Public. Each room
     * 						has a owner assigned who can control the room.
     * 
     * 						3. Legacy - This
     * 						entity represents external endpoints. Think of it as a label to
     * 						identify and search external devices.
     * 						Legacy entity does not have
     * 						an account on the VidyoPortal. There is no owner assigned to
     * 						legacy devices.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEntityType()
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
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

    /**
     * Gets the value of the handRaised property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandRaised() {
        return handRaised;
    }

    /**
     * Sets the value of the handRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandRaised(JAXBElement<Boolean> value) {
        this.handRaised = value;
    }

    /**
     * Gets the value of the presenter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPresenter() {
        return presenter;
    }

    /**
     * Sets the value of the presenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPresenter(JAXBElement<Boolean> value) {
        this.presenter = value;
    }

}
