
package com.vidyo.portalapp.wsdl;

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
 *         <element name="local-part" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "localPart",
    "domain",
    "pin",
    "referenceNumber"
})
@XmlRootElement(name = "JoinIPCConferenceRequest")
public class JoinIPCConferenceRequest {

    @XmlElement(name = "local-part", required = true)
    protected String localPart;
    @XmlElement(required = true)
    protected String domain;
    @XmlElementRef(name = "PIN", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pin;
    @XmlElementRef(name = "referenceNumber", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber;

    /**
     * Gets the value of the localPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPart() {
        return localPart;
    }

    /**
     * Sets the value of the localPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPart(String value) {
        this.localPart = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPIN(JAXBElement<String> value) {
        this.pin = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceNumber(JAXBElement<String> value) {
        this.referenceNumber = value;
    }

}
