//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.15 at 11:31:42 AM EDT 
//


package simplenlg.xmlrealiser.wrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VPPhraseSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VPPhraseSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://code.google.com/p/simplenlg/schemas/version1}PhraseElement">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://code.google.com/p/simplenlg/schemas/version1}vpPhraseAtts"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VPPhraseSpec")
public class VPPhraseSpec
    extends PhraseElement
{

    @XmlAttribute(name = "FORM")
    protected Form form;
    @XmlAttribute(name = "MODAL")
    protected String modal;
    @XmlAttribute(name = "NEGATED")
    protected Boolean negated;
    @XmlAttribute(name = "PASSIVE")
    protected Boolean passive;
    @XmlAttribute(name = "PERFECT")
    protected Boolean perfect;
    @XmlAttribute(name = "PERSON")
    protected Person person;
    @XmlAttribute(name = "PROGRESSIVE")
    protected Boolean progressive;
    @XmlAttribute(name = "TENSE")
    protected Tense tense;

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link Form }
     *     
     */
    public Form getFORM() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link Form }
     *     
     */
    public void setFORM(Form value) {
        this.form = value;
    }

    /**
     * Gets the value of the modal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODAL() {
        return modal;
    }

    /**
     * Sets the value of the modal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODAL(String value) {
        this.modal = value;
    }

    /**
     * Gets the value of the negated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNEGATED() {
        return negated;
    }

    /**
     * Sets the value of the negated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNEGATED(Boolean value) {
        this.negated = value;
    }

    /**
     * Gets the value of the passive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPASSIVE() {
        return passive;
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPASSIVE(Boolean value) {
        this.passive = value;
    }

    /**
     * Gets the value of the perfect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPERFECT() {
        return perfect;
    }

    /**
     * Sets the value of the perfect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPERFECT(Boolean value) {
        this.perfect = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPERSON() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPERSON(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the progressive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPROGRESSIVE() {
        return progressive;
    }

    /**
     * Sets the value of the progressive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPROGRESSIVE(Boolean value) {
        this.progressive = value;
    }

    /**
     * Gets the value of the tense property.
     * 
     * @return
     *     possible object is
     *     {@link Tense }
     *     
     */
    public Tense getTENSE() {
        return tense;
    }

    /**
     * Sets the value of the tense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tense }
     *     
     */
    public void setTENSE(Tense value) {
        this.tense = value;
    }

}
