
package com.vidyo.moderatorapp.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;

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
 *         <element name="participantID" type="{http://portal.vidyo.com/user/v1_1}EntityID" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}EntityType"/>
 *         <element name="ownerID" type="{http://portal.vidyo.com/user/v1_1}EntityID" minOccurs="0"/>
 *         <element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="extension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tenant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}Language" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}MemberStatus" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}MemberMode" minOccurs="0"/>
 *         <element name="canCallDirect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="canJoinMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="canRecordMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="isInMyContacts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}RoomStatus" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}RoomMode" minOccurs="0"/>
 *         <element name="canControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="audio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="video" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="appshare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="phone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="phone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="instantMessagerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="thumbnailUpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="thumbnailPhoto" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "ownerID",
    "displayName",
    "extension",
    "emailAddress",
    "tenant",
    "description",
    "language",
    "memberStatus",
    "memberMode",
    "canCallDirect",
    "canJoinMeeting",
    "canRecordMeeting",
    "isInMyContacts",
    "roomStatus",
    "roomMode",
    "canControl",
    "audio",
    "video",
    "appshare",
    "phone1",
    "phone2",
    "phone3",
    "department",
    "title",
    "instantMessagerID",
    "location",
    "thumbnailUpdateTime",
    "thumbnailPhoto"
})
@XmlRootElement(name = "EntityDetails")
public class EntityDetails {

    @XmlElement(required = true)
    protected String entityID;
    @XmlElementRef(name = "participantID", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> participantID;
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
    @XmlElementRef(name = "ownerID", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerID;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected String extension;
    @XmlElementRef(name = "emailAddress", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "tenant", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tenant;
    protected String description;
    /**
     * Languages supported by VidyoPortal
     * 
     */
    @XmlElement(name = "Language")
    protected String language;
    /**
     * Describes the member status based on the
     * 						operation state of the endpoint in use by the member:
     * 						- Status is
     * 						'Offline' and hence can't be reached for a conference.
     * 						- Status is
     * 						'Online' and can be reached for a conference or a direct call.
     * 						-
     * 						Status is 'Busy' in conference and can't can be reached for
     * 						another conference or a direct call.
     * 						- Status is 'BusyInOwnRoom' in
     * 						conference in own personal room and can't can be reached for
     * 						another conference.
     * 						- Status is 'Ringing' endpoint associated with
     * 						member start to ring on receive direct call or invite event from
     * 						other part.
     * 						- Status is 'RingAccepted' endpoint associated with
     * 						member accept the call from other part.
     * 						- Status is 'RingRejected'
     * 						endpoint associated with member reject the call from other part.
     * 						-
     * 						Status is 'RingNoAnswer' endpoint associated with member is not
     * 						answered in some period of time.
     * 						- Status is 'Alerting' endpoint
     * 						associated with member is alerting about outcome call.
     * 						- Status is
     * 						'AlertCancelled' endpoint associated with member is stop to be
     * 						alerting about outcome call.
     * 
     */
    @XmlElement(name = "MemberStatus")
    protected String memberStatus;
    /**
     * The Member can override the current status with
     * 						these possible values. Changing a mode will impact VidyoPortal
     * 						operations.
     * 						For e.g. if the mode is set to DoNotDisturb for a
     * 						member, this member will not get any incoming requests to join a
     * 						meeting or a direct call.
     * 
     */
    @XmlElement(name = "MemberMode")
    protected String memberMode;
    protected Boolean canCallDirect;
    protected Boolean canJoinMeeting;
    protected Boolean canRecordMeeting;
    protected Boolean isInMyContacts;
    /**
     * Status is 'Empty' and hence can be used for
     * 						meeting.
     * 						Status is 'Full' and is not accepting any more
     * 						participants to the meeting.
     * 						Status is 'Occupied' some participants
     * 						use the room for meeting.
     * 
     */
    @XmlElement(name = "RoomStatus")
    protected String roomStatus;
    /**
     * - 'roomURL' (optional) means that room has an URL
     * 						to be used to join the meeting. Typically used for sending
     * 						invitations to users via mail, etc.
     * 						- 'roomLocked' means the owner
     * 						is not allowing any more participants to join the room.
     * 						- 'hasPIN'
     * 						means that the participant is required to enter a PIN in order to
     * 						join this room.
     * 						- 'roomPIN' (optional) is the actual PIN that
     * 						participant uses to enter the room.
     * 						- 'hasModeratorPIN' (optional)
     * 						means that the participant is
     * 						required to enter a Moderator PIN in
     * 						order to control this room.
     * 						- 'moderatorPIN' (optional) is the
     * 						actual Moderator PIN that
     * 						participant uses to control the room.
     * 
     */
    @XmlElement(name = "RoomMode")
    protected RoomMode roomMode;
    protected Boolean canControl;
    @XmlElementRef(name = "audio", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> audio;
    @XmlElementRef(name = "video", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> video;
    @XmlElementRef(name = "appshare", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> appshare;
    @XmlElementRef(name = "phone1", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone1;
    @XmlElementRef(name = "phone2", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone2;
    @XmlElementRef(name = "phone3", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone3;
    @XmlElementRef(name = "department", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;
    @XmlElementRef(name = "title", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "instantMessagerID", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instantMessagerID;
    @XmlElementRef(name = "location", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "thumbnailUpdateTime", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> thumbnailUpdateTime;
    protected byte[] thumbnailPhoto;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParticipantID() {
        return participantID;
    }

    /**
     * Sets the value of the participantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParticipantID(JAXBElement<String> value) {
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
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerID(JAXBElement<String> value) {
        this.ownerID = value;
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
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the tenant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTenant() {
        return tenant;
    }

    /**
     * Sets the value of the tenant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTenant(JAXBElement<String> value) {
        this.tenant = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Languages supported by VidyoPortal
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLanguage()
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Describes the member status based on the
     * 						operation state of the endpoint in use by the member:
     * 						- Status is
     * 						'Offline' and hence can't be reached for a conference.
     * 						- Status is
     * 						'Online' and can be reached for a conference or a direct call.
     * 						-
     * 						Status is 'Busy' in conference and can't can be reached for
     * 						another conference or a direct call.
     * 						- Status is 'BusyInOwnRoom' in
     * 						conference in own personal room and can't can be reached for
     * 						another conference.
     * 						- Status is 'Ringing' endpoint associated with
     * 						member start to ring on receive direct call or invite event from
     * 						other part.
     * 						- Status is 'RingAccepted' endpoint associated with
     * 						member accept the call from other part.
     * 						- Status is 'RingRejected'
     * 						endpoint associated with member reject the call from other part.
     * 						-
     * 						Status is 'RingNoAnswer' endpoint associated with member is not
     * 						answered in some period of time.
     * 						- Status is 'Alerting' endpoint
     * 						associated with member is alerting about outcome call.
     * 						- Status is
     * 						'AlertCancelled' endpoint associated with member is stop to be
     * 						alerting about outcome call.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberStatus() {
        return memberStatus;
    }

    /**
     * Sets the value of the memberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMemberStatus()
     */
    public void setMemberStatus(String value) {
        this.memberStatus = value;
    }

    /**
     * The Member can override the current status with
     * 						these possible values. Changing a mode will impact VidyoPortal
     * 						operations.
     * 						For e.g. if the mode is set to DoNotDisturb for a
     * 						member, this member will not get any incoming requests to join a
     * 						meeting or a direct call.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberMode() {
        return memberMode;
    }

    /**
     * Sets the value of the memberMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMemberMode()
     */
    public void setMemberMode(String value) {
        this.memberMode = value;
    }

    /**
     * Gets the value of the canCallDirect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCallDirect() {
        return canCallDirect;
    }

    /**
     * Sets the value of the canCallDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCallDirect(Boolean value) {
        this.canCallDirect = value;
    }

    /**
     * Gets the value of the canJoinMeeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanJoinMeeting() {
        return canJoinMeeting;
    }

    /**
     * Sets the value of the canJoinMeeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanJoinMeeting(Boolean value) {
        this.canJoinMeeting = value;
    }

    /**
     * Gets the value of the canRecordMeeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanRecordMeeting() {
        return canRecordMeeting;
    }

    /**
     * Sets the value of the canRecordMeeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanRecordMeeting(Boolean value) {
        this.canRecordMeeting = value;
    }

    /**
     * Gets the value of the isInMyContacts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInMyContacts() {
        return isInMyContacts;
    }

    /**
     * Sets the value of the isInMyContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInMyContacts(Boolean value) {
        this.isInMyContacts = value;
    }

    /**
     * Status is 'Empty' and hence can be used for
     * 						meeting.
     * 						Status is 'Full' and is not accepting any more
     * 						participants to the meeting.
     * 						Status is 'Occupied' some participants
     * 						use the room for meeting.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomStatus() {
        return roomStatus;
    }

    /**
     * Sets the value of the roomStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRoomStatus()
     */
    public void setRoomStatus(String value) {
        this.roomStatus = value;
    }

    /**
     * - 'roomURL' (optional) means that room has an URL
     * 						to be used to join the meeting. Typically used for sending
     * 						invitations to users via mail, etc.
     * 						- 'roomLocked' means the owner
     * 						is not allowing any more participants to join the room.
     * 						- 'hasPIN'
     * 						means that the participant is required to enter a PIN in order to
     * 						join this room.
     * 						- 'roomPIN' (optional) is the actual PIN that
     * 						participant uses to enter the room.
     * 						- 'hasModeratorPIN' (optional)
     * 						means that the participant is
     * 						required to enter a Moderator PIN in
     * 						order to control this room.
     * 						- 'moderatorPIN' (optional) is the
     * 						actual Moderator PIN that
     * 						participant uses to control the room.
     * 
     * @return
     *     possible object is
     *     {@link RoomMode }
     *     
     */
    public RoomMode getRoomMode() {
        return roomMode;
    }

    /**
     * Sets the value of the roomMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomMode }
     *     
     * @see #getRoomMode()
     */
    public void setRoomMode(RoomMode value) {
        this.roomMode = value;
    }

    /**
     * Gets the value of the canControl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanControl() {
        return canControl;
    }

    /**
     * Sets the value of the canControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanControl(Boolean value) {
        this.canControl = value;
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
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone1(JAXBElement<String> value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone2(JAXBElement<String> value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the phone3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone3() {
        return phone3;
    }

    /**
     * Sets the value of the phone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone3(JAXBElement<String> value) {
        this.phone3 = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the instantMessagerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstantMessagerID() {
        return instantMessagerID;
    }

    /**
     * Sets the value of the instantMessagerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstantMessagerID(JAXBElement<String> value) {
        this.instantMessagerID = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the thumbnailUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getThumbnailUpdateTime() {
        return thumbnailUpdateTime;
    }

    /**
     * Sets the value of the thumbnailUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setThumbnailUpdateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.thumbnailUpdateTime = value;
    }

    /**
     * Gets the value of the thumbnailPhoto property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getThumbnailPhoto() {
        return thumbnailPhoto;
    }

    /**
     * Sets the value of the thumbnailPhoto property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setThumbnailPhoto(byte[] value) {
        this.thumbnailPhoto = value;
    }

}
