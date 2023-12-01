
package com.vidyo.portalapp.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://portal.vidyo.com/user/v1_1}RoomAccessOption" maxOccurs="unbounded"/>
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
    "roomAccessOption"
})
@XmlRootElement(name = "RoomAccessOptionsResponse")
public class RoomAccessOptionsResponse {

    @XmlElement(name = "RoomAccessOption", required = true)
    protected List<RoomAccessOption> roomAccessOption;

    /**
     * Gets the value of the roomAccessOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAccessOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRoomAccessOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAccessOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the roomAccessOption property.
     */
    public List<RoomAccessOption> getRoomAccessOption() {
        if (roomAccessOption == null) {
            roomAccessOption = new ArrayList<>();
        }
        return this.roomAccessOption;
    }

}
