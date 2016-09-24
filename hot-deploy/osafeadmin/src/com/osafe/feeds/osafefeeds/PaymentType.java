//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.25 at 12:23:56 AM CST 
//


package com.osafe.feeds.osafefeeds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentMethodId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SagePayPaymentToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PayPalPaymentToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PayPalPayerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PayPalPayerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MerchantReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MerchantTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PayPalTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EbsTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EbsPaymentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentGatewayResponse" type="{}PaymentGatewayResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "paymentMethodId",
    "paymentMethod",
    "statusId",
    "amount",
    "cardType",
    "cardNumber",
    "expiryDate",
    "sagePayPaymentToken",
    "payPalPaymentToken",
    "payPalPayerId",
    "payPalPayerStatus",
    "merchantReferenceNumber",
    "merchantTransactionId",
    "payPalTransactionId",
    "ebsTransactionId",
    "ebsPaymentId",
    "paymentGatewayResponse"
})
public class PaymentType {

    @XmlElement(name = "PaymentMethodId", required = true)
    protected String paymentMethodId;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;
    @XmlElement(name = "StatusId", required = true)
    protected String statusId;
    @XmlElement(name = "Amount", required = true)
    protected String amount;
    @XmlElement(name = "CardType", required = true)
    protected String cardType;
    @XmlElement(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlElement(name = "ExpiryDate", required = true)
    protected String expiryDate;
    @XmlElement(name = "SagePayPaymentToken", required = true)
    protected String sagePayPaymentToken;
    @XmlElement(name = "PayPalPaymentToken", required = true)
    protected String payPalPaymentToken;
    @XmlElement(name = "PayPalPayerId", required = true)
    protected String payPalPayerId;
    @XmlElement(name = "PayPalPayerStatus", required = true)
    protected String payPalPayerStatus;
    @XmlElement(name = "MerchantReferenceNumber", required = true)
    protected String merchantReferenceNumber;
    @XmlElement(name = "MerchantTransactionId", required = true)
    protected String merchantTransactionId;
    @XmlElement(name = "PayPalTransactionId", required = true)
    protected String payPalTransactionId;
    @XmlElement(name = "EbsTransactionId", required = true)
    protected String ebsTransactionId;
    @XmlElement(name = "EbsPaymentId", required = true)
    protected String ebsPaymentId;
    @XmlElement(name = "PaymentGatewayResponse", required = true)
    protected PaymentGatewayResponseType paymentGatewayResponse;

    /**
     * Gets the value of the paymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * Sets the value of the paymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodId(String value) {
        this.paymentMethodId = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusId(String value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the sagePayPaymentToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSagePayPaymentToken() {
        return sagePayPaymentToken;
    }

    /**
     * Sets the value of the sagePayPaymentToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSagePayPaymentToken(String value) {
        this.sagePayPaymentToken = value;
    }

    /**
     * Gets the value of the payPalPaymentToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalPaymentToken() {
        return payPalPaymentToken;
    }

    /**
     * Sets the value of the payPalPaymentToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalPaymentToken(String value) {
        this.payPalPaymentToken = value;
    }

    /**
     * Gets the value of the payPalPayerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalPayerId() {
        return payPalPayerId;
    }

    /**
     * Sets the value of the payPalPayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalPayerId(String value) {
        this.payPalPayerId = value;
    }

    /**
     * Gets the value of the payPalPayerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalPayerStatus() {
        return payPalPayerStatus;
    }

    /**
     * Sets the value of the payPalPayerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalPayerStatus(String value) {
        this.payPalPayerStatus = value;
    }

    /**
     * Gets the value of the merchantReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReferenceNumber() {
        return merchantReferenceNumber;
    }

    /**
     * Sets the value of the merchantReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReferenceNumber(String value) {
        this.merchantReferenceNumber = value;
    }

    /**
     * Gets the value of the merchantTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTransactionId() {
        return merchantTransactionId;
    }

    /**
     * Sets the value of the merchantTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionId(String value) {
        this.merchantTransactionId = value;
    }

    /**
     * Gets the value of the payPalTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalTransactionId() {
        return payPalTransactionId;
    }

    /**
     * Sets the value of the payPalTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalTransactionId(String value) {
        this.payPalTransactionId = value;
    }

    /**
     * Gets the value of the ebsTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbsTransactionId() {
        return ebsTransactionId;
    }

    /**
     * Sets the value of the ebsTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbsTransactionId(String value) {
        this.ebsTransactionId = value;
    }

    /**
     * Gets the value of the ebsPaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbsPaymentId() {
        return ebsPaymentId;
    }

    /**
     * Sets the value of the ebsPaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbsPaymentId(String value) {
        this.ebsPaymentId = value;
    }

    /**
     * Gets the value of the paymentGatewayResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentGatewayResponseType }
     *     
     */
    public PaymentGatewayResponseType getPaymentGatewayResponse() {
        return paymentGatewayResponse;
    }

    /**
     * Sets the value of the paymentGatewayResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentGatewayResponseType }
     *     
     */
    public void setPaymentGatewayResponse(PaymentGatewayResponseType value) {
        this.paymentGatewayResponse = value;
    }

}
