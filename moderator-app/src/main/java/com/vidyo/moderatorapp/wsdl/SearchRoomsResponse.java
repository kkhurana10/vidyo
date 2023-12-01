
package com.vidyo.moderatorapp.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="queryField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="roomType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="start" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="limit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="sortBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sortDir" type="{http://portal.vidyo.com/user/v1_1}sortDir"/>
 *         <element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}Room" maxOccurs="unbounded" minOccurs="0"/>
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
    "query",
    "queryField",
    "roomType",
    "start",
    "limit",
    "sortBy",
    "sortDir",
    "total",
    "room"
})
@XmlRootElement(name = "SearchRoomsResponse")
public class SearchRoomsResponse {

    @XmlElement(required = true)
    protected String query;
    @XmlElement(required = true)
    protected String queryField;
    @XmlElement(required = true)
    protected String roomType;
    @XmlElement(required = true)
    protected BigInteger start;
    @XmlElement(required = true)
    protected BigInteger limit;
    @XmlElement(required = true)
    protected String sortBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SortDir sortDir;
    protected int total;
    /**
     * This object is returned as a result of search for
     * 						rooms.
     * 
     */
    @XmlElement(name = "Room")
    protected List<Room> room;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the queryField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryField() {
        return queryField;
    }

    /**
     * Sets the value of the queryField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryField(String value) {
        this.queryField = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimit(BigInteger value) {
        this.limit = value;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the sortDir property.
     * 
     * @return
     *     possible object is
     *     {@link SortDir }
     *     
     */
    public SortDir getSortDir() {
        return sortDir;
    }

    /**
     * Sets the value of the sortDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDir }
     *     
     */
    public void setSortDir(SortDir value) {
        this.sortDir = value;
    }

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
     * 						rooms.
     * 
     * Gets the value of the room property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the room property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Room }
     * </p>
     * 
     * 
     * @return
     *     The value of the room property.
     */
    public List<Room> getRoom() {
        if (room == null) {
            room = new ArrayList<>();
        }
        return this.room;
    }

}
