
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
 *         <element name="realUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "realUserName"
})
@XmlRootElement(name = "GetUserNameResponse")
public class GetUserNameResponse {

    @XmlElement(required = true)
    protected String realUserName;

    /**
     * Gets the value of the realUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealUserName() {
        return realUserName;
    }

    /**
     * Sets the value of the realUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealUserName(String value) {
        this.realUserName = value;
    }

}
