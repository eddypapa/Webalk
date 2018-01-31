
package hu.iit.uni.miskolc.conroller.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewspaperRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewspaperRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publosher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="issue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewspaperRequest", namespace = "http://services.memorynotfound.com/", propOrder = {
    "id",
    "name",
    "publosher",
    "year",
    "issue"
})
public class NewspaperRequest {

    @XmlElement(namespace = "http://services.memorynotfound.com/")
    protected int id;
    @XmlElement(namespace = "http://services.memorynotfound.com/", required = true)
    protected String name;
    @XmlElement(namespace = "http://services.memorynotfound.com/", required = true)
    protected String publosher;
    @XmlElement(namespace = "http://services.memorynotfound.com/")
    protected int year;
    @XmlElement(namespace = "http://services.memorynotfound.com/")
    protected int issue;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the publosher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublosher() {
        return publosher;
    }

    /**
     * Sets the value of the publosher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublosher(String value) {
        this.publosher = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     */
    public int getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     */
    public void setIssue(int value) {
        this.issue = value;
    }

}
