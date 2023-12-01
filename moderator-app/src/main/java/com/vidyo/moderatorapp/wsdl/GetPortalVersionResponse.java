
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
 *         <element name="portalVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "portalVersion"
})
@XmlRootElement(name = "GetPortalVersionResponse")
public class GetPortalVersionResponse {

    @XmlElement(required = true)
    protected String portalVersion;

    /**
     * Gets the value of the portalVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalVersion() {
        return portalVersion;
    }

    /**
     * Sets the value of the portalVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalVersion(String value) {
        this.portalVersion = value;
    }

}
