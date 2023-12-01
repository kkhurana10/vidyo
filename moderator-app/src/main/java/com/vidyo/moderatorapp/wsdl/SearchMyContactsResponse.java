
package com.vidyo.moderatorapp.wsdl;

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
 *         <element ref="{http://portal.vidyo.com/user/v1_1}Entity" maxOccurs="unbounded" minOccurs="0"/>
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
    "entity"
})
@XmlRootElement(name = "SearchMyContactsResponse")
public class SearchMyContactsResponse {

    protected int total;
    /**
     * This object is returned as a result of search for
     * 						member, public room, or legacy device.
     * 
     */
    @XmlElement(name = "Entity")
    protected List<Entity> entity;

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
     * Gets the value of the entity property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entity property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entity }
     * </p>
     * 
     * 
     * @return
     *     The value of the entity property.
     */
    public List<Entity> getEntity() {
        if (entity == null) {
            entity = new ArrayList<>();
        }
        return this.entity;
    }

}
