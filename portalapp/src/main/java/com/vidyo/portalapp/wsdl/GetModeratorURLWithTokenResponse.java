
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
 *         <element name="moderatorURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "moderatorURL"
})
@XmlRootElement(name = "GetModeratorURLWithTokenResponse")
public class GetModeratorURLWithTokenResponse {

    @XmlElement(required = true, nillable = true)
    protected String moderatorURL;

    /**
     * Gets the value of the moderatorURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeratorURL() {
        return moderatorURL;
    }

    /**
     * Sets the value of the moderatorURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeratorURL(String value) {
        this.moderatorURL = value;
    }

}
