//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.28 at 05:42:27 PM CET 
//


package org.glotaran.core.models.tgm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IrfparPanelModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IrfparPanelModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dispmufun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="disptaufun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parmu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partau" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parmufixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="partaufixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lamda" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="irf" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         &lt;element name="irftype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/>
 *         &lt;element name="backsweepEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="backsweepPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="measuredIrf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mirf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="convalg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reftau" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="parmulist" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         &lt;element name="partaulist" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         &lt;element name="parmufixedlist" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/>
 *         &lt;element name="partaufixedlist" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrfparPanelModel", propOrder = {
    "dispmufun",
    "disptaufun",
    "parmu",
    "partau",
    "parmufixed",
    "partaufixed",
    "lamda",
    "irf",
    "irftype",
    "fixed",
    "backsweepEnabled",
    "backsweepPeriod",
    "measuredIrf",
    "mirf",
    "convalg",
    "reftau",
    "parmulist",
    "partaulist",
    "parmufixedlist",
    "partaufixedlist"
})
public class IrfparPanelModel {

    @XmlElement(required = true, nillable = true)
    protected String dispmufun;
    @XmlElement(required = true, nillable = true)
    protected String disptaufun;
    @XmlElement(required = true, nillable = true)
    protected String parmu;
    @XmlElement(required = true, nillable = true)
    protected String partau;
    @XmlElement(required = true, type = Boolean.class, defaultValue = "false", nillable = true)
    protected Boolean parmufixed;
    @XmlElement(required = true, type = Boolean.class, defaultValue = "false", nillable = true)
    protected Boolean partaufixed;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double lamda;
    @XmlElement(required = true, defaultValue = "0", nillable = true)
    protected List<Double> irf;
    @XmlElement(required = true, nillable = true)
    protected String irftype;
    @XmlElement(required = true, defaultValue = "false", nillable = true)
    protected List<Boolean> fixed;
    @XmlElement(required = true, type = Boolean.class, defaultValue = "false", nillable = true)
    protected Boolean backsweepEnabled;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double backsweepPeriod;
    @XmlElement(required = true, nillable = true)
    protected String measuredIrf;
    @XmlElement(required = true, type = Boolean.class, defaultValue = "false", nillable = true)
    protected Boolean mirf;
    @XmlElement(required = true, type = Integer.class, defaultValue = "2", nillable = true)
    protected Integer convalg;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double reftau;
    @XmlElement(required = true, nillable = true)
    protected List<Double> parmulist;
    @XmlElement(required = true, nillable = true)
    protected List<Double> partaulist;
    @XmlElement(required = true, nillable = true)
    protected List<Boolean> parmufixedlist;
    @XmlElement(required = true, nillable = true)
    protected List<Boolean> partaufixedlist;

    /**
     * Gets the value of the dispmufun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispmufun() {
        return dispmufun;
    }

    /**
     * Sets the value of the dispmufun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispmufun(String value) {
        this.dispmufun = value;
    }

    /**
     * Gets the value of the disptaufun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisptaufun() {
        return disptaufun;
    }

    /**
     * Sets the value of the disptaufun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisptaufun(String value) {
        this.disptaufun = value;
    }

    /**
     * Gets the value of the parmu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmu() {
        return parmu;
    }

    /**
     * Sets the value of the parmu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmu(String value) {
        this.parmu = value;
    }

    /**
     * Gets the value of the partau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartau() {
        return partau;
    }

    /**
     * Sets the value of the partau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartau(String value) {
        this.partau = value;
    }

    /**
     * Gets the value of the parmufixed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParmufixed() {
        return parmufixed;
    }

    /**
     * Sets the value of the parmufixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParmufixed(Boolean value) {
        this.parmufixed = value;
    }

    /**
     * Gets the value of the partaufixed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartaufixed() {
        return partaufixed;
    }

    /**
     * Sets the value of the partaufixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartaufixed(Boolean value) {
        this.partaufixed = value;
    }

    /**
     * Gets the value of the lamda property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLamda() {
        return lamda;
    }

    /**
     * Sets the value of the lamda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLamda(Double value) {
        this.lamda = value;
    }

    /**
     * Gets the value of the irf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the irf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getIrf() {
        if (irf == null) {
            irf = new ArrayList<Double>();
        }
        return this.irf;
    }

    /**
     * Gets the value of the irftype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrftype() {
        return irftype;
    }

    /**
     * Sets the value of the irftype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrftype(String value) {
        this.irftype = value;
    }

    /**
     * Gets the value of the fixed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getFixed() {
        if (fixed == null) {
            fixed = new ArrayList<Boolean>();
        }
        return this.fixed;
    }

    /**
     * Gets the value of the backsweepEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBacksweepEnabled() {
        return backsweepEnabled;
    }

    /**
     * Sets the value of the backsweepEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBacksweepEnabled(Boolean value) {
        this.backsweepEnabled = value;
    }

    /**
     * Gets the value of the backsweepPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBacksweepPeriod() {
        return backsweepPeriod;
    }

    /**
     * Sets the value of the backsweepPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBacksweepPeriod(Double value) {
        this.backsweepPeriod = value;
    }

    /**
     * Gets the value of the measuredIrf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuredIrf() {
        return measuredIrf;
    }

    /**
     * Sets the value of the measuredIrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuredIrf(String value) {
        this.measuredIrf = value;
    }

    /**
     * Gets the value of the mirf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMirf() {
        return mirf;
    }

    /**
     * Sets the value of the mirf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMirf(Boolean value) {
        this.mirf = value;
    }

    /**
     * Gets the value of the convalg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConvalg() {
        return convalg;
    }

    /**
     * Sets the value of the convalg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConvalg(Integer value) {
        this.convalg = value;
    }

    /**
     * Gets the value of the reftau property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReftau() {
        return reftau;
    }

    /**
     * Sets the value of the reftau property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReftau(Double value) {
        this.reftau = value;
    }

    /**
     * Gets the value of the parmulist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parmulist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParmulist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getParmulist() {
        if (parmulist == null) {
            parmulist = new ArrayList<Double>();
        }
        return this.parmulist;
    }

    /**
     * Gets the value of the partaulist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partaulist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartaulist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getPartaulist() {
        if (partaulist == null) {
            partaulist = new ArrayList<Double>();
        }
        return this.partaulist;
    }

    /**
     * Gets the value of the parmufixedlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parmufixedlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParmufixedlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getParmufixedlist() {
        if (parmufixedlist == null) {
            parmufixedlist = new ArrayList<Boolean>();
        }
        return this.parmufixedlist;
    }

    /**
     * Gets the value of the partaufixedlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partaufixedlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartaufixedlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getPartaufixedlist() {
        if (partaufixedlist == null) {
            partaufixedlist = new ArrayList<Boolean>();
        }
        return this.partaufixedlist;
    }

}
