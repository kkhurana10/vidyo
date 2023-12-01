
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
 *         <element ref="{http://portal.vidyo.com/user/v1_1}OK"/>
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
    "ok"
})
@XmlRootElement(name = "StartVideoResponse")
public class StartVideoResponse {

    /**
     * string representation of successful operation -
     * 						'ok'
     * 
     */
    @XmlElement(name = "OK", required = true)
    protected String ok;

    /**
     * string representation of successful operation -
     * 						'ok'
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOK() {
        return ok;
    }

    /**
     * Sets the value of the ok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOK()
     */
    public void setOK(String value) {
        this.ok = value;
    }

}
