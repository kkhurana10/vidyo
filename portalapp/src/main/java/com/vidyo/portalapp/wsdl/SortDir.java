
package com.vidyo.portalapp.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for sortDir</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="sortDir">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASC"/>
 *     <enumeration value="DESC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "sortDir")
@XmlEnum
public enum SortDir {

    ASC,
    DESC;

    public String value() {
        return name();
    }

    public static SortDir fromValue(String v) {
        return valueOf(v);
    }

}
