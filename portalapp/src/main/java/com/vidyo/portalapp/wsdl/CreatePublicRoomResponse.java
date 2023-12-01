
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
 *         <element name="roomID" type="{http://portal.vidyo.com/user/v1_1}EntityID"/>
 *         <element name="extension">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="roomURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="inMyContacts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hasPIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "roomID",
    "extension",
    "roomURL",
    "inMyContacts",
    "locked",
    "hasPIN"
})
@XmlRootElement(name = "CreatePublicRoomResponse")
public class CreatePublicRoomResponse {

    @XmlElement(required = true)
    protected String roomID;
    @XmlElement(required = true)
    protected String extension;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String roomURL;
    protected Boolean inMyContacts;
    protected Boolean locked;
    protected Boolean hasPIN;

    /**
     * Gets the value of the roomID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * Sets the value of the roomID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomID(String value) {
        this.roomID = value;
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
     * Gets the value of the inMyContacts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInMyContacts() {
        return inMyContacts;
    }

    /**
     * Sets the value of the inMyContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInMyContacts(Boolean value) {
        this.inMyContacts = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the hasPIN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPIN() {
        return hasPIN;
    }

    /**
     * Sets the value of the hasPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPIN(Boolean value) {
        this.hasPIN = value;
    }

}
