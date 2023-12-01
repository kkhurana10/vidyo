
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
 *         <element name="roomID" type="{http://portal.vidyo.com/user/v1_1}EntityID" minOccurs="0"/>
 *         <element name="returnHtmlContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "returnHtmlContent"
})
@XmlRootElement(name = "GetInviteContentRequest")
public class GetInviteContentRequest {

    protected String roomID;
    @XmlElement(defaultValue = "false")
    protected Boolean returnHtmlContent;

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
     * Gets the value of the returnHtmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnHtmlContent() {
        return returnHtmlContent;
    }

    /**
     * Sets the value of the returnHtmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnHtmlContent(Boolean value) {
        this.returnHtmlContent = value;
    }

}
