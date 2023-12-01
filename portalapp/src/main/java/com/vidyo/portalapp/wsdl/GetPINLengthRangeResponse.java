
package com.vidyo.portalapp.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="minimumPINLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maximumPINLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "minimumPINLength",
    "maximumPINLength"
})
@XmlRootElement(name = "GetPINLengthRangeResponse")
public class GetPINLengthRangeResponse {

    protected int minimumPINLength;
    protected int maximumPINLength;

    /**
     * Gets the value of the minimumPINLength property.
     * 
     */
    public int getMinimumPINLength() {
        return minimumPINLength;
    }

    /**
     * Sets the value of the minimumPINLength property.
     * 
     */
    public void setMinimumPINLength(int value) {
        this.minimumPINLength = value;
    }

    /**
     * Gets the value of the maximumPINLength property.
     * 
     */
    public int getMaximumPINLength() {
        return maximumPINLength;
    }

    /**
     * Sets the value of the maximumPINLength property.
     * 
     */
    public void setMaximumPINLength(int value) {
        this.maximumPINLength = value;
    }

}
