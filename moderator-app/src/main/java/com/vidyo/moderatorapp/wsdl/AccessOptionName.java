
package com.vidyo.moderatorapp.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of Allowed Access Option Names.
 * 
 * <p>Java class for AccessOptionName</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AccessOptionName">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="roomURL"/>
 *     <enumeration value="extension"/>
 *     <enumeration value="PIN"/>
 *     <enumeration value="dial-in-Number"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccessOptionName")
@XmlEnum
public enum AccessOptionName {

    @XmlEnumValue("roomURL")
    ROOM_URL("roomURL"),
    @XmlEnumValue("extension")
    EXTENSION("extension"),
    PIN("PIN"),
    @XmlEnumValue("dial-in-Number")
    DIAL_IN_NUMBER("dial-in-Number");
    private final String value;

    AccessOptionName(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static AccessOptionName fromValue(String v) {
        for (AccessOptionName c: AccessOptionName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
