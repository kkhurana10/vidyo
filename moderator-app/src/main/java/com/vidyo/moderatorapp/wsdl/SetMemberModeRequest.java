
package com.vidyo.moderatorapp.wsdl;

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
 *         <element ref="{http://portal.vidyo.com/user/v1_1}MemberMode"/>
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
    "memberMode"
})
@XmlRootElement(name = "SetMemberModeRequest")
public class SetMemberModeRequest {

    /**
     * The Member can override the current status with
     * 						these possible values. Changing a mode will impact VidyoPortal
     * 						operations.
     * 						For e.g. if the mode is set to DoNotDisturb for a
     * 						member, this member will not get any incoming requests to join a
     * 						meeting or a direct call.
     * 
     */
    @XmlElement(name = "MemberMode", required = true)
    protected String memberMode;

    /**
     * The Member can override the current status with
     * 						these possible values. Changing a mode will impact VidyoPortal
     * 						operations.
     * 						For e.g. if the mode is set to DoNotDisturb for a
     * 						member, this member will not get any incoming requests to join a
     * 						meeting or a direct call.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberMode() {
        return memberMode;
    }

    /**
     * Sets the value of the memberMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMemberMode()
     */
    public void setMemberMode(String value) {
        this.memberMode = value;
    }

}
