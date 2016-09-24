//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.25 at 12:42:51 AM CST 
//


package com.osafe.feeds.osafefeeds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderHeader" type="{}OrderHeaderType"/>
 *         &lt;element name="Customer" type="{}CustomerType"/>
 *         &lt;element name="OrderShipment" type="{}OrderShipmentType"/>
 *         &lt;element name="OrderLineItems" type="{}OrderLineItemsType"/>
 *         &lt;element name="OrderPayment" type="{}OrderPaymentType"/>
 *         &lt;element name="OrderAdjustment" type="{}OrderAdjustmentType"/>
 *         &lt;element name="OrderAttribute" type="{}OrderAttributeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", propOrder = {
    "orderHeader",
    "customer",
    "orderShipment",
    "orderLineItems",
    "orderPayment",
    "orderAdjustment",
    "orderAttribute"
})
public class OrderType {

    @XmlElement(name = "OrderHeader", required = true)
    protected OrderHeaderType orderHeader;
    @XmlElement(name = "Customer", required = true)
    protected CustomerType customer;
    @XmlElement(name = "OrderShipment", required = true)
    protected OrderShipmentType orderShipment;
    @XmlElement(name = "OrderLineItems", required = true)
    protected OrderLineItemsType orderLineItems;
    @XmlElement(name = "OrderPayment", required = true)
    protected OrderPaymentType orderPayment;
    @XmlElement(name = "OrderAdjustment", required = true)
    protected OrderAdjustmentType orderAdjustment;
    @XmlElement(name = "OrderAttribute", required = true)
    protected OrderAttributeType orderAttribute;

    /**
     * Gets the value of the orderHeader property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeaderType }
     *     
     */
    public OrderHeaderType getOrderHeader() {
        return orderHeader;
    }

    /**
     * Sets the value of the orderHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeaderType }
     *     
     */
    public void setOrderHeader(OrderHeaderType value) {
        this.orderHeader = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the orderShipment property.
     * 
     * @return
     *     possible object is
     *     {@link OrderShipmentType }
     *     
     */
    public OrderShipmentType getOrderShipment() {
        return orderShipment;
    }

    /**
     * Sets the value of the orderShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderShipmentType }
     *     
     */
    public void setOrderShipment(OrderShipmentType value) {
        this.orderShipment = value;
    }

    /**
     * Gets the value of the orderLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLineItemsType }
     *     
     */
    public OrderLineItemsType getOrderLineItems() {
        return orderLineItems;
    }

    /**
     * Sets the value of the orderLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineItemsType }
     *     
     */
    public void setOrderLineItems(OrderLineItemsType value) {
        this.orderLineItems = value;
    }

    /**
     * Gets the value of the orderPayment property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentType }
     *     
     */
    public OrderPaymentType getOrderPayment() {
        return orderPayment;
    }

    /**
     * Sets the value of the orderPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentType }
     *     
     */
    public void setOrderPayment(OrderPaymentType value) {
        this.orderPayment = value;
    }

    /**
     * Gets the value of the orderAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAdjustmentType }
     *     
     */
    public OrderAdjustmentType getOrderAdjustment() {
        return orderAdjustment;
    }

    /**
     * Sets the value of the orderAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAdjustmentType }
     *     
     */
    public void setOrderAdjustment(OrderAdjustmentType value) {
        this.orderAdjustment = value;
    }

    /**
     * Gets the value of the orderAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAttributeType }
     *     
     */
    public OrderAttributeType getOrderAttribute() {
        return orderAttribute;
    }

    /**
     * Sets the value of the orderAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAttributeType }
     *     
     */
    public void setOrderAttribute(OrderAttributeType value) {
        this.orderAttribute = value;
    }

}
