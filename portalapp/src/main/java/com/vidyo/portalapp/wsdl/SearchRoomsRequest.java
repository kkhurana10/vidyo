
package com.vidyo.portalapp.wsdl;

import java.math.BigInteger;
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
 *         <element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="queryField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="roomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="start" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="limit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="sortBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sortDir" type="{http://portal.vidyo.com/user/v1_1}sortDir" minOccurs="0"/>
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
    "sortDir"
})
@XmlRootElement(name = "SearchRoomsRequest")
public class SearchRoomsRequest {

    @XmlElement(required = true)
    protected String query;
    @XmlElementRef(name = "queryField", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queryField;
    @XmlElementRef(name = "roomType", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomType;
    @XmlElementRef(name = "start", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> start;
    @XmlElementRef(name = "limit", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> limit;
    @XmlElementRef(name = "sortBy", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sortBy;
    @XmlElementRef(name = "sortDir", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<SortDir> sortDir;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueryField() {
        return queryField;
    }

    /**
     * Sets the value of the queryField property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueryField(JAXBElement<String> value) {
        this.queryField = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomType(JAXBElement<String> value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setStart(JAXBElement<BigInteger> value) {
        this.start = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setLimit(JAXBElement<BigInteger> value) {
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
     * Gets the value of the sortDir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     *     
     */
    public JAXBElement<SortDir> getSortDir() {
        return sortDir;
    }

    /**
     * Sets the value of the sortDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SortDir }{@code >}
     *     
     */
    public void setSortDir(JAXBElement<SortDir> value) {
        this.sortDir = value;
    }

}
