
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         <element name="loginBannerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}WelcomeBannerContent" minOccurs="0"/>
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
    "loginBannerText",
    "welcomeBannerContent"
})
@XmlRootElement(name = "getLoginAndWelcomeBannerResponse")
public class GetLoginAndWelcomeBannerResponse {

    @XmlElementRef(name = "loginBannerText", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginBannerText;
    /**
     * WelcomeBannerContent for a text based message to
     * 						be used on the endpoints upon successful login with the last 5
     * 						login attempts (successful and unsuccessful) for that particular
     * 						user.
     * 
     */
    @XmlElement(name = "WelcomeBannerContent")
    protected WelcomeBannerContent welcomeBannerContent;

    /**
     * Gets the value of the loginBannerText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginBannerText() {
        return loginBannerText;
    }

    /**
     * Sets the value of the loginBannerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginBannerText(JAXBElement<String> value) {
        this.loginBannerText = value;
    }

    /**
     * WelcomeBannerContent for a text based message to
     * 						be used on the endpoints upon successful login with the last 5
     * 						login attempts (successful and unsuccessful) for that particular
     * 						user.
     * 
     * @return
     *     possible object is
     *     {@link WelcomeBannerContent }
     *     
     */
    public WelcomeBannerContent getWelcomeBannerContent() {
        return welcomeBannerContent;
    }

    /**
     * Sets the value of the welcomeBannerContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link WelcomeBannerContent }
     *     
     * @see #getWelcomeBannerContent()
     */
    public void setWelcomeBannerContent(WelcomeBannerContent value) {
        this.welcomeBannerContent = value;
    }

}
