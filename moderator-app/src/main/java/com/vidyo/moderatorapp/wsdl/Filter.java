
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         <element name="start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="sortBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dir" type="{http://portal.vidyo.com/user/v1_1}sortDir" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}EntityType" minOccurs="0"/>
 *         <element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "start",
    "limit",
    "sortBy",
    "dir",
    "entityType",
    "query"
})
@XmlRootElement(name = "Filter")
public class Filter {

    @XmlElementRef(name = "start", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> start;
    @XmlElementRef(name = "limit", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> limit;
    @XmlElementRef(name = "sortBy", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sortBy;
    @XmlElementRef(name = "dir", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<SortDir> dir;
    /**
     * There are three types of entities in VidyoPortal:
     * 						1. Member - A member is an authorized user of VidyoPortal with a
     * 						user account.
     * 						- A member may have at the most one personal room.
     * 						- A
     * 						member has a display name
     * 						- A member has an extension that can also
     * 						be used for search purposes.
     * 
     * 						2. Room - It is a meeting place. Rooms
     * 						are of two kinds:
     * 						- Personal, as explained above
     * 						- Public. Each room
     * 						has a owner assigned who can control the room.
     * 
     * 						3. Legacy - This
     * 						entity represents external endpoints. Think of it as a label to
     * 						identify and search external devices.
     * 						Legacy entity does not have
     * 						an account on the VidyoPortal. There is no owner assigned to
     * 						legacy devices.
     * 
     */
    @XmlElement(name = "EntityType")
    protected String entityType;
    @XmlElementRef(name = "query", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> query;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStart(JAXBElement<Integer> value) {
        this.start = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLimit(JAXBElement<Integer> value) {
        this.limit = value;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSortBy(JAXBElement<String> value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     *     
     */
    public JAXBElement<SortDir> getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     *     
     */
    public void setDir(JAXBElement<SortDir> value) {
        this.dir = value;
    }

    /**
     * There are three types of entities in VidyoPortal:
     * 						1. Member - A member is an authorized user of VidyoPortal with a
     * 						user account.
     * 						- A member may have at the most one personal room.
     * 						- A
     * 						member has a display name
     * 						- A member has an extension that can also
     * 						be used for search purposes.
     * 
     * 						2. Room - It is a meeting place. Rooms
     * 						are of two kinds:
     * 						- Personal, as explained above
     * 						- Public. Each room
     * 						has a owner assigned who can control the room.
     * 
     * 						3. Legacy - This
     * 						entity represents external endpoints. Think of it as a label to
     * 						identify and search external devices.
     * 						Legacy entity does not have
     * 						an account on the VidyoPortal. There is no owner assigned to
     * 						legacy devices.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEntityType()
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuery(JAXBElement<String> value) {
        this.query = value;
    }

}
