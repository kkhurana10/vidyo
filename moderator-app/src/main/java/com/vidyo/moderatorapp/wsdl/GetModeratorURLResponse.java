
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
 *         <element name="moderatorURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hasModeratorPIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "moderatorURL",
    "hasModeratorPIN"
})
@XmlRootElement(name = "GetModeratorURLResponse")
public class GetModeratorURLResponse {

    @XmlElementRef(name = "moderatorURL", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moderatorURL;
    protected Boolean hasModeratorPIN;

    /**
     * Gets the value of the moderatorURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModeratorURL() {
        return moderatorURL;
    }

    /**
     * Sets the value of the moderatorURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModeratorURL(JAXBElement<String> value) {
        this.moderatorURL = value;
    }

    /**
     * Gets the value of the hasModeratorPIN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasModeratorPIN() {
        return hasModeratorPIN;
    }

    /**
     * Sets the value of the hasModeratorPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasModeratorPIN(Boolean value) {
        this.hasModeratorPIN = value;
    }

}
