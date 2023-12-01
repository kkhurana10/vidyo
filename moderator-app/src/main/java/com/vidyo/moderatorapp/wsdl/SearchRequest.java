
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
 *         <element ref="{http://portal.vidyo.com/user/v1_1}Filter"/>
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
    "filter"
})
@XmlRootElement(name = "SearchRequest")
public class SearchRequest {

    /**
     * Filter for search queries.
     * 						A SOAP fault will be
     * 						thrown if limit exceeds 200. Default value for limit is 40.
     * 						Anything higher than 40 may result in poor system performance.
     * 
     */
    @XmlElement(name = "Filter", required = true)
    protected Filter filter;

    /**
     * Filter for search queries.
     * 						A SOAP fault will be
     * 						thrown if limit exceeds 200. Default value for limit is 40.
     * 						Anything higher than 40 may result in poor system performance.
     * 
     * @return
     *     possible object is
     *     {@link Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     * @see #getFilter()
     */
    public void setFilter(Filter value) {
        this.filter = value;
    }

}
