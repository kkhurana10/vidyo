
package com.vidyo.portalapp.wsdl;

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
 *         <element name="recurring" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="400"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="setPIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="returnHtmlContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="returnRoomDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "recurring",
    "setPIN",
    "returnHtmlContent",
    "returnRoomDetails"
})
@XmlRootElement(name = "CreateScheduledRoomRequest")
public class CreateScheduledRoomRequest {

    protected Integer recurring;
    protected Boolean setPIN;
    @XmlElement(defaultValue = "false")
    protected Boolean returnHtmlContent;
    @XmlElement(defaultValue = "false")
    protected Boolean returnRoomDetails;

    /**
     * Gets the value of the recurring property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurring() {
        return recurring;
    }

    /**
     * Sets the value of the recurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurring(Integer value) {
        this.recurring = value;
    }

    /**
     * Gets the value of the setPIN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetPIN() {
        return setPIN;
    }

    /**
     * Sets the value of the setPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetPIN(Boolean value) {
        this.setPIN = value;
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

    /**
     * Gets the value of the returnRoomDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRoomDetails() {
        return returnRoomDetails;
    }

    /**
     * Sets the value of the returnRoomDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRoomDetails(Boolean value) {
        this.returnRoomDetails = value;
    }

}
