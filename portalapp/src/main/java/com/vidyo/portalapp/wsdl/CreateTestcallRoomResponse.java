
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
 *         <element name="roomKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="roomURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
    "roomKey",
    "roomURL"
})
@XmlRootElement(name = "CreateTestcallRoomResponse")
public class CreateTestcallRoomResponse {

    @XmlElement(required = true)
    protected String extension;
    @XmlElement(required = true)
    protected String roomKey;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String roomURL;

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
     * Gets the value of the roomKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomKey() {
        return roomKey;
    }

    /**
     * Sets the value of the roomKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomKey(String value) {
        this.roomKey = value;
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

}
