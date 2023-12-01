
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
 *         <element name="ParticipantStatus" type="{http://portal.vidyo.com/user/v1_1}ParticipantStatus"/>
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
    "participantStatus"
})
@XmlRootElement(name = "ParticipantStatusResponse")
public class ParticipantStatusResponse {

    @XmlElement(name = "ParticipantStatus", required = true)
    protected ParticipantStatus participantStatus;

    /**
     * Gets the value of the participantStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantStatus }
     *     
     */
    public ParticipantStatus getParticipantStatus() {
        return participantStatus;
    }

    /**
     * Sets the value of the participantStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantStatus }
     *     
     */
    public void setParticipantStatus(ParticipantStatus value) {
        this.participantStatus = value;
    }

}
