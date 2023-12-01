
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
 *         <element name="userAccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "userAccountType"
})
@XmlRootElement(name = "getUserAccountTypeResponse")
public class GetUserAccountTypeResponse {

    @XmlElement(required = true)
    protected String userAccountType;

    /**
     * Gets the value of the userAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccountType() {
        return userAccountType;
    }

    /**
     * Sets the value of the userAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccountType(String value) {
        this.userAccountType = value;
    }

}
