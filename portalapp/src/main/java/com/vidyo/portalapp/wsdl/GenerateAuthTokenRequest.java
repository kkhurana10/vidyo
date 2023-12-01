
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
 *         <element name="validityTime">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="endpointId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="returnJwtTokens" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "validityTime",
    "endpointId",
    "returnJwtTokens"
})
@XmlRootElement(name = "GenerateAuthTokenRequest")
public class GenerateAuthTokenRequest {

    protected int validityTime;
    @XmlElement(required = true)
    protected String endpointId;
    @XmlElement(defaultValue = "false")
    protected Boolean returnJwtTokens;

    /**
     * Gets the value of the validityTime property.
     * 
     */
    public int getValidityTime() {
        return validityTime;
    }

    /**
     * Sets the value of the validityTime property.
     * 
     */
    public void setValidityTime(int value) {
        this.validityTime = value;
    }

    /**
     * Gets the value of the endpointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * Sets the value of the endpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointId(String value) {
        this.endpointId = value;
    }

    /**
     * Gets the value of the returnJwtTokens property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnJwtTokens() {
        return returnJwtTokens;
    }

    /**
     * Sets the value of the returnJwtTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnJwtTokens(Boolean value) {
        this.returnJwtTokens = value;
    }

}
