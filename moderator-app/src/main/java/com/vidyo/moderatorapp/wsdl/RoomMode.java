
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="roomURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="isLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hasPIN" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="roomPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hasModeratorPIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "roomURL",
    "isLocked",
    "hasPIN",
    "roomPIN",
    "hasModeratorPIN",
    "moderatorPIN"
})
@XmlRootElement(name = "RoomMode")
public class RoomMode {

    @XmlElementRef(name = "roomURL", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomURL;
    protected boolean isLocked;
    protected boolean hasPIN;
    @XmlElementRef(name = "roomPIN", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomPIN;
    @XmlElementRef(name = "hasModeratorPIN", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hasModeratorPIN;
    @XmlElementRef(name = "moderatorPIN", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moderatorPIN;

    /**
     * Gets the value of the roomURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomURL() {
        return roomURL;
    }

    /**
     * Sets the value of the roomURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomURL(JAXBElement<String> value) {
        this.roomURL = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     */
    public boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     */
    public void setIsLocked(boolean value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the hasPIN property.
     * 
     */
    public boolean isHasPIN() {
        return hasPIN;
    }

    /**
     * Sets the value of the hasPIN property.
     * 
     */
    public void setHasPIN(boolean value) {
        this.hasPIN = value;
    }

    /**
     * Gets the value of the roomPIN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomPIN() {
        return roomPIN;
    }

    /**
     * Sets the value of the roomPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomPIN(JAXBElement<String> value) {
        this.roomPIN = value;
    }

    /**
     * Gets the value of the hasModeratorPIN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHasModeratorPIN() {
        return hasModeratorPIN;
    }

    /**
     * Sets the value of the hasModeratorPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHasModeratorPIN(JAXBElement<Boolean> value) {
        this.hasModeratorPIN = value;
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
