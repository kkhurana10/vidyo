
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
 *         <element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}EntityDetails" maxOccurs="unbounded" minOccurs="0"/>
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
    "total",
    "entityDetails"
})
@XmlRootElement(name = "GetEntityDetailsByEntityIDResponse")
public class GetEntityDetailsByEntityIDResponse {

    protected int total;
    /**
     * This object is returned as a result of search for
     * 						member, public room, or legacy device.
     * 
     */
    @XmlElement(name = "EntityDetails")
    protected List<EntityDetails> entityDetails;

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * This object is returned as a result of search for
     * 						member, public room, or legacy device.
     * 
     * Gets the value of the entityDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the entityDetails property.
     */
    public List<EntityDetails> getEntityDetails() {
        if (entityDetails == null) {
            entityDetails = new ArrayList<>();
        }
        return this.entityDetails;
    }

}
