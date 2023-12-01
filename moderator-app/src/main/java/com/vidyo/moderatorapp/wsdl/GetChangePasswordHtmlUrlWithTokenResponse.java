
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
 *         <element name="changePasswordHtmlUrlWithToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "changePasswordHtmlUrlWithToken"
})
@XmlRootElement(name = "GetChangePasswordHtmlUrlWithTokenResponse")
public class GetChangePasswordHtmlUrlWithTokenResponse {

    @XmlElement(required = true)
    protected String changePasswordHtmlUrlWithToken;

    /**
     * Gets the value of the changePasswordHtmlUrlWithToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangePasswordHtmlUrlWithToken() {
        return changePasswordHtmlUrlWithToken;
    }

    /**
     * Sets the value of the changePasswordHtmlUrlWithToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangePasswordHtmlUrlWithToken(String value) {
        this.changePasswordHtmlUrlWithToken = value;
    }

}
