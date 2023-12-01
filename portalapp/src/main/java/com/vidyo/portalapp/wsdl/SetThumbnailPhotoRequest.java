
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
 *         <element name="thumbNailPhoto" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "thumbNailPhoto"
})
@XmlRootElement(name = "SetThumbnailPhotoRequest")
public class SetThumbnailPhotoRequest {

    @XmlElement(required = true)
    protected byte[] thumbNailPhoto;

    /**
     * Gets the value of the thumbNailPhoto property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getThumbNailPhoto() {
        return thumbNailPhoto;
    }

    /**
     * Sets the value of the thumbNailPhoto property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setThumbNailPhoto(byte[] value) {
        this.thumbNailPhoto = value;
    }

}
