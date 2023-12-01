
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
 *         <element ref="{http://portal.vidyo.com/user/v1_1}MemberStatus"/>
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
    "memberStatus"
})
@XmlRootElement(name = "MyEndpointStatusResponse")
public class MyEndpointStatusResponse {

    /**
     * Describes the member status based on the
     * 						operation state of the endpoint in use by the member:
     * 						- Status is
     * 						'Offline' and hence can't be reached for a conference.
     * 						- Status is
     * 						'Online' and can be reached for a conference or a direct call.
     * 						-
     * 						Status is 'Busy' in conference and can't can be reached for
     * 						another conference or a direct call.
     * 						- Status is 'BusyInOwnRoom' in
     * 						conference in own personal room and can't can be reached for
     * 						another conference.
     * 						- Status is 'Ringing' endpoint associated with
     * 						member start to ring on receive direct call or invite event from
     * 						other part.
     * 						- Status is 'RingAccepted' endpoint associated with
     * 						member accept the call from other part.
     * 						- Status is 'RingRejected'
     * 						endpoint associated with member reject the call from other part.
     * 						-
     * 						Status is 'RingNoAnswer' endpoint associated with member is not
     * 						answered in some period of time.
     * 						- Status is 'Alerting' endpoint
     * 						associated with member is alerting about outcome call.
     * 						- Status is
     * 						'AlertCancelled' endpoint associated with member is stop to be
     * 						alerting about outcome call.
     * 
     */
    @XmlElement(name = "MemberStatus", required = true)
    protected String memberStatus;

    /**
     * Describes the member status based on the
     * 						operation state of the endpoint in use by the member:
     * 						- Status is
     * 						'Offline' and hence can't be reached for a conference.
     * 						- Status is
     * 						'Online' and can be reached for a conference or a direct call.
     * 						-
     * 						Status is 'Busy' in conference and can't can be reached for
     * 						another conference or a direct call.
     * 						- Status is 'BusyInOwnRoom' in
     * 						conference in own personal room and can't can be reached for
     * 						another conference.
     * 						- Status is 'Ringing' endpoint associated with
     * 						member start to ring on receive direct call or invite event from
     * 						other part.
     * 						- Status is 'RingAccepted' endpoint associated with
     * 						member accept the call from other part.
     * 						- Status is 'RingRejected'
     * 						endpoint associated with member reject the call from other part.
     * 						-
     * 						Status is 'RingNoAnswer' endpoint associated with member is not
     * 						answered in some period of time.
     * 						- Status is 'Alerting' endpoint
     * 						associated with member is alerting about outcome call.
     * 						- Status is
     * 						'AlertCancelled' endpoint associated with member is stop to be
     * 						alerting about outcome call.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberStatus() {
        return memberStatus;
    }

    /**
     * Sets the value of the memberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMemberStatus()
     */
    public void setMemberStatus(String value) {
        this.memberStatus = value;
    }

}
