
package com.vidyo.portalapp.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="extension">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="pin" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="inviteContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="roomURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="inviteSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="htmlContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}Room" minOccurs="0"/>
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
    "extension",
    "pin",
    "inviteContent",
    "roomURL",
    "inviteSubject",
    "htmlContent",
    "room"
})
@XmlRootElement(name = "CreateScheduledRoomResponse")
public class CreateScheduledRoomResponse {

    @XmlElement(required = true)
    protected String extension;
    protected String pin;
    @XmlElement(required = true)
    protected String inviteContent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String roomURL;
    protected String inviteSubject;
    protected String htmlContent;
    /**
     * This object is returned as a result of search for
     * 						rooms.
     * 
     */
    @XmlElement(name = "Room")
    protected Room room;

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
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the inviteContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteContent() {
        return inviteContent;
    }

    /**
     * Sets the value of the inviteContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteContent(String value) {
        this.inviteContent = value;
    }

    /**
     * Gets the value of the roomURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomURL() {
        return roomURL;
    }

    /**
     * Sets the value of the roomURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomURL(String value) {
        this.roomURL = value;
    }

    /**
     * Gets the value of the inviteSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteSubject() {
        return inviteSubject;
    }

    /**
     * Sets the value of the inviteSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteSubject(String value) {
        this.inviteSubject = value;
    }

    /**
     * Gets the value of the htmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlContent() {
        return htmlContent;
    }

    /**
     * Sets the value of the htmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlContent(String value) {
        this.htmlContent = value;
    }

    /**
     * This object is returned as a result of search for
     * 						rooms.
     * 
     * @return
     *     possible object is
     *     {@link Room }
     *     
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link Room }
     *     
     * @see #getRoom()
     */
    public void setRoom(Room value) {
        this.room = value;
    }

}
