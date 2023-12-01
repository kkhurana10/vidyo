
package com.vidyo.portalapp.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sourceIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="attemptTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "result",
    "sourceIPAddress",
    "attemptTime"
})
@XmlRootElement(name = "LoginAttempt")
public class LoginAttempt {

    @XmlElement(required = true)
    protected String result;
    @XmlElement(required = true, nillable = true)
    protected String sourceIPAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attemptTime;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the sourceIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIPAddress() {
        return sourceIPAddress;
    }

    /**
     * Sets the value of the sourceIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIPAddress(String value) {
        this.sourceIPAddress = value;
    }

    /**
     * Gets the value of the attemptTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttemptTime() {
        return attemptTime;
    }

    /**
     * Sets the value of the attemptTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttemptTime(XMLGregorianCalendar value) {
        this.attemptTime = value;
    }

}
