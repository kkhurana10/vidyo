
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Available Recording Profile
 * 
 * <p>Java class for Recorder complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Recorder">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="recorderPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recorder", propOrder = {
    "recorderPrefix",
    "description"
})
public class Recorder {

    @XmlElement(required = true)
    protected String recorderPrefix;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the recorderPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecorderPrefix() {
        return recorderPrefix;
    }

    /**
     * Sets the value of the recorderPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecorderPrefix(String value) {
        this.recorderPrefix = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
