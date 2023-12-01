
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
 *         <element name="webCastURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hasWebCastPIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "webCastURL",
    "hasWebCastPIN"
})
@XmlRootElement(name = "GetWebcastURLResponse")
public class GetWebcastURLResponse {

    @XmlElementRef(name = "webCastURL", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webCastURL;
    protected Boolean hasWebCastPIN;

    /**
     * Gets the value of the webCastURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebCastURL() {
        return webCastURL;
    }

    /**
     * Sets the value of the webCastURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebCastURL(JAXBElement<String> value) {
        this.webCastURL = value;
    }

    /**
     * Gets the value of the hasWebCastPIN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasWebCastPIN() {
        return hasWebCastPIN;
    }

    /**
     * Sets the value of the hasWebCastPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasWebCastPIN(Boolean value) {
        this.hasWebCastPIN = value;
    }

}
