
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
 *         <element name="authToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vidyoReplayLibraryUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "authToken",
    "vidyoReplayLibraryUrl"
})
@XmlRootElement(name = "GetVidyoReplayLibraryResponse")
public class GetVidyoReplayLibraryResponse {

    @XmlElement(required = true)
    protected String authToken;
    @XmlElement(required = true)
    protected String vidyoReplayLibraryUrl;

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

    /**
     * Gets the value of the vidyoReplayLibraryUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVidyoReplayLibraryUrl() {
        return vidyoReplayLibraryUrl;
    }

    /**
     * Sets the value of the vidyoReplayLibraryUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVidyoReplayLibraryUrl(String value) {
        this.vidyoReplayLibraryUrl = value;
    }

}
