
package com.vidyo.moderatorapp.wsdl;

import java.util.ArrayList;
import java.util.List;

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
 *         <element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="recorderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="recorderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paused" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="webcast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="lectureMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element ref="{http://portal.vidyo.com/user/v1_1}LectureModeParticipant" maxOccurs="unbounded" minOccurs="0"/>
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
    "recorderID",
    "recorderName",
    "paused",
    "webcast",
    "lectureMode",
    "lectureModeParticipant"
})
@XmlRootElement(name = "GetLectureModeParticipantsResponse")
public class GetLectureModeParticipantsResponse {

    protected int total;
    @XmlElementRef(name = "recorderID", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> recorderID;
    @XmlElementRef(name = "recorderName", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recorderName;
    @XmlElementRef(name = "paused", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> paused;
    @XmlElementRef(name = "webcast", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> webcast;
    @XmlElementRef(name = "lectureMode", namespace = "http://portal.vidyo.com/user/v1_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> lectureMode;
    /**
     * This object is returned as a result of
     * 						getLectureModeParticipants
     * 
     */
    @XmlElement(name = "LectureModeParticipant")
    protected List<LectureModeParticipant> lectureModeParticipant;

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
     * Gets the value of the recorderID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecorderID() {
        return recorderID;
    }

    /**
     * Sets the value of the recorderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecorderID(JAXBElement<Integer> value) {
        this.recorderID = value;
    }

    /**
     * Gets the value of the recorderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecorderName() {
        return recorderName;
    }

    /**
     * Sets the value of the recorderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecorderName(JAXBElement<String> value) {
        this.recorderName = value;
    }

    /**
     * Gets the value of the paused property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPaused() {
        return paused;
    }

    /**
     * Sets the value of the paused property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPaused(JAXBElement<Boolean> value) {
        this.paused = value;
    }

    /**
     * Gets the value of the webcast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWebcast() {
        return webcast;
    }

    /**
     * Sets the value of the webcast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWebcast(JAXBElement<Boolean> value) {
        this.webcast = value;
    }

    /**
     * Gets the value of the lectureMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLectureMode() {
        return lectureMode;
    }

    /**
     * Sets the value of the lectureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLectureMode(JAXBElement<Boolean> value) {
        this.lectureMode = value;
    }

    /**
     * This object is returned as a result of
     * 						getLectureModeParticipants
     * 
     * Gets the value of the lectureModeParticipant property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lectureModeParticipant property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLectureModeParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LectureModeParticipant }
     * </p>
     * 
     * 
     * @return
     *     The value of the lectureModeParticipant property.
     */
    public List<LectureModeParticipant> getLectureModeParticipant() {
        if (lectureModeParticipant == null) {
            lectureModeParticipant = new ArrayList<>();
        }
        return this.lectureModeParticipant;
    }

}
