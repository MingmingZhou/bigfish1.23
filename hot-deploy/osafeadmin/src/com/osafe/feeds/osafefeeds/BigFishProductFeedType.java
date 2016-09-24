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
 * <p>Java class for BigFishProductFeedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BigFishProductFeedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ProductCategory" type="{}ProductCategoryType" minOccurs="0"/>
 *         &lt;element name="Products" type="{}ProductsType" minOccurs="0"/>
 *         &lt;element name="ProductAssociation" type="{}ProductAssociationType" minOccurs="0"/>
 *         &lt;element name="ProductFacetGroup" type="{}ProductFacetCatGroupType" minOccurs="0"/>
 *         &lt;element name="ProductFacetValue" type="{}ProductFacetValueType" minOccurs="0"/>
 *         &lt;element name="ProductManufacturer" type="{}ProductManufacturerType" minOccurs="0"/>
 *         &lt;element name="ProductAttribute" type="{}ProductAttributesType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BigFishProductFeedType", propOrder = {

})
public class BigFishProductFeedType {

    @XmlElement(name = "ProductCategory")
    protected ProductCategoryType productCategory;
    @XmlElement(name = "Products")
    protected ProductsType products;
    @XmlElement(name = "ProductAssociation")
    protected ProductAssociationType productAssociation;
    @XmlElement(name = "ProductFacetGroup")
    protected ProductFacetCatGroupType productFacetGroup;
    @XmlElement(name = "ProductFacetValue")
    protected ProductFacetValueType productFacetValue;
    @XmlElement(name = "ProductManufacturer")
    protected ProductManufacturerType productManufacturer;
    @XmlElement(name = "ProductAttribute")
    protected ProductAttributesType productAttribute;

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryType }
     *     
     */
    public ProductCategoryType getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryType }
     *     
     */
    public void setProductCategory(ProductCategoryType value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsType }
     *     
     */
    public ProductsType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsType }
     *     
     */
    public void setProducts(ProductsType value) {
        this.products = value;
    }

    /**
     * Gets the value of the productAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAssociationType }
     *     
     */
    public ProductAssociationType getProductAssociation() {
        return productAssociation;
    }

    /**
     * Sets the value of the productAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAssociationType }
     *     
     */
    public void setProductAssociation(ProductAssociationType value) {
        this.productAssociation = value;
    }

    /**
     * Gets the value of the productFacetGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFacetCatGroupType }
     *     
     */
    public ProductFacetCatGroupType getProductFacetGroup() {
        return productFacetGroup;
    }

    /**
     * Sets the value of the productFacetGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFacetCatGroupType }
     *     
     */
    public void setProductFacetGroup(ProductFacetCatGroupType value) {
        this.productFacetGroup = value;
    }

    /**
     * Gets the value of the productFacetValue property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFacetValueType }
     *     
     */
    public ProductFacetValueType getProductFacetValue() {
        return productFacetValue;
    }

    /**
     * Sets the value of the productFacetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFacetValueType }
     *     
     */
    public void setProductFacetValue(ProductFacetValueType value) {
        this.productFacetValue = value;
    }

    /**
     * Gets the value of the productManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link ProductManufacturerType }
     *     
     */
    public ProductManufacturerType getProductManufacturer() {
        return productManufacturer;
    }

    /**
     * Sets the value of the productManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductManufacturerType }
     *     
     */
    public void setProductManufacturer(ProductManufacturerType value) {
        this.productManufacturer = value;
    }

    /**
     * Gets the value of the productAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttributesType }
     *     
     */
    public ProductAttributesType getProductAttribute() {
        return productAttribute;
    }

    /**
     * Sets the value of the productAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttributesType }
     *     
     */
    public void setProductAttribute(ProductAttributesType value) {
        this.productAttribute = value;
    }

}
