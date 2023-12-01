
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Available Room Profile
 * 
 * <p>Java class for RoomProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RoomProfile">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="roomProfileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomProfile", propOrder = {
    "roomProfileName",
    "description"
})
public class RoomProfile {

    @XmlElement(required = true)
    protected String roomProfileName;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the roomProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomProfileName() {
        return roomProfileName;
    }

    /**
     * Sets the value of the roomProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomProfileName(String value) {
        this.roomProfileName = value;
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

}
