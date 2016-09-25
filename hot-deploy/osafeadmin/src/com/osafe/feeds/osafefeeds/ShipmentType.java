//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.25 at 03:13:31 PM CST 
//


package com.osafe.feeds.osafefeeds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipGroupSequenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingAddress" type="{}ShippingAddressType"/>
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingInstructions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipGroupLineItem" type="{}ShipGroupLineItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentType", propOrder = {
    "shipGroupSequenceId",
    "shippingAddress",
    "carrier",
    "shippingMethod",
    "trackingNumber",
    "shippingInstructions",
    "shipGroupLineItem"
})
public class ShipmentType {

    @XmlElement(name = "ShipGroupSequenceId", required = true)
    protected String shipGroupSequenceId;
    @XmlElement(name = "ShippingAddress", required = true)
    protected ShippingAddressType shippingAddress;
    @XmlElement(name = "Carrier", required = true)
    protected String carrier;
    @XmlElement(name = "ShippingMethod", required = true)
    protected String shippingMethod;
    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "ShippingInstructions", required = true)
    protected String shippingInstructions;
    @XmlElement(name = "ShipGroupLineItem", required = true)
    protected List<ShipGroupLineItemType> shipGroupLineItem;

    /**
     * Gets the value of the shipGroupSequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipGroupSequenceId() {
        return shipGroupSequenceId;
    }

    /**
     * Sets the value of the shipGroupSequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipGroupSequenceId(String value) {
        this.shipGroupSequenceId = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAddressType }
     *     
     */
    public ShippingAddressType getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAddressType }
     *     
     */
    public void setShippingAddress(ShippingAddressType value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the shippingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingInstructions() {
        return shippingInstructions;
    }

    /**
     * Sets the value of the shippingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingInstructions(String value) {
        this.shippingInstructions = value;
    }

    /**
     * Gets the value of the shipGroupLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipGroupLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipGroupLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipGroupLineItemType }
     * 
     * 
     */
    public List<ShipGroupLineItemType> getShipGroupLineItem() {
        if (shipGroupLineItem == null) {
            shipGroupLineItem = new ArrayList<ShipGroupLineItemType>();
        }
        return this.shipGroupLineItem;
    }

}
