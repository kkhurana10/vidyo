
package com.vidyo.moderatorapp.wsdl;

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
 *         <element name="roomProfile" type="{http://portal.vidyo.com/user/v1_1}RoomProfile"/>
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
    "roomProfile"
})
@XmlRootElement(name = "GetRoomProfileResponse")
public class GetRoomProfileResponse {

    @XmlElement(required = true, nillable = true)
    protected RoomProfile roomProfile;

    /**
     * Gets the value of the roomProfile property.
     * 
     * @return
     *     possible object is
     *     {@link RoomProfile }
     *     
     */
    public RoomProfile getRoomProfile() {
        return roomProfile;
    }

    /**
     * Sets the value of the roomProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomProfile }
     *     
     */
    public void setRoomProfile(RoomProfile value) {
        this.roomProfile = value;
    }

}
