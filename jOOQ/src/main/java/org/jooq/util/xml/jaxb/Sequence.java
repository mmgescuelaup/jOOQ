
package org.jooq.util.xml.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jooq.util.jaxb.tools.StringAdapter;
import org.jooq.util.jaxb.tools.XMLAppendable;
import org.jooq.util.jaxb.tools.XMLBuilder;


/**
 * <p>Java class for Sequence complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Sequence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="sequence_catalog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sequence_schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sequence_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="data_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="character_maximum_length" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numeric_precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numeric_scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="start_with" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="increment_by" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="min_value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="max_value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cycle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cache" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sequence", propOrder = {

})
@SuppressWarnings({
    "all"
})
public class Sequence implements Serializable, XMLAppendable
{

    private final static long serialVersionUID = 31300L;
    @XmlElement(name = "sequence_catalog")
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String sequenceCatalog;
    @XmlElement(name = "sequence_schema")
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String sequenceSchema;
    @XmlElement(name = "sequence_name", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String sequenceName;
    @XmlElement(name = "data_type", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String dataType;
    @XmlElement(name = "character_maximum_length")
    protected Integer characterMaximumLength;
    @XmlElement(name = "numeric_precision")
    protected Integer numericPrecision;
    @XmlElement(name = "numeric_scale")
    protected Integer numericScale;
    @XmlElement(name = "start_with")
    protected Long startWith;
    @XmlElement(name = "increment_by")
    protected Long incrementBy;
    @XmlElement(name = "min_value")
    protected Long minValue;
    @XmlElement(name = "max_value")
    protected Long maxValue;
    protected Boolean cycle;
    protected Long cache;
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String comment;

    public String getSequenceCatalog() {
        return sequenceCatalog;
    }

    public void setSequenceCatalog(String value) {
        this.sequenceCatalog = value;
    }

    public String getSequenceSchema() {
        return sequenceSchema;
    }

    public void setSequenceSchema(String value) {
        this.sequenceSchema = value;
    }

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String value) {
        this.sequenceName = value;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String value) {
        this.dataType = value;
    }

    public Integer getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(Integer value) {
        this.characterMaximumLength = value;
    }

    public Integer getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Integer value) {
        this.numericPrecision = value;
    }

    public Integer getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Integer value) {
        this.numericScale = value;
    }

    public Long getStartWith() {
        return startWith;
    }

    public void setStartWith(Long value) {
        this.startWith = value;
    }

    public Long getIncrementBy() {
        return incrementBy;
    }

    public void setIncrementBy(Long value) {
        this.incrementBy = value;
    }

    public Long getMinValue() {
        return minValue;
    }

    public void setMinValue(Long value) {
        this.minValue = value;
    }

    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the cycle property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCycle() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCycle(Boolean value) {
        this.cycle = value;
    }

    public Long getCache() {
        return cache;
    }

    public void setCache(Long value) {
        this.cache = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String value) {
        this.comment = value;
    }

    public Sequence withSequenceCatalog(String value) {
        setSequenceCatalog(value);
        return this;
    }

    public Sequence withSequenceSchema(String value) {
        setSequenceSchema(value);
        return this;
    }

    public Sequence withSequenceName(String value) {
        setSequenceName(value);
        return this;
    }

    public Sequence withDataType(String value) {
        setDataType(value);
        return this;
    }

    public Sequence withCharacterMaximumLength(Integer value) {
        setCharacterMaximumLength(value);
        return this;
    }

    public Sequence withNumericPrecision(Integer value) {
        setNumericPrecision(value);
        return this;
    }

    public Sequence withNumericScale(Integer value) {
        setNumericScale(value);
        return this;
    }

    public Sequence withStartWith(Long value) {
        setStartWith(value);
        return this;
    }

    public Sequence withIncrementBy(Long value) {
        setIncrementBy(value);
        return this;
    }

    public Sequence withMinValue(Long value) {
        setMinValue(value);
        return this;
    }

    public Sequence withMaxValue(Long value) {
        setMaxValue(value);
        return this;
    }

    public Sequence withCycle(Boolean value) {
        setCycle(value);
        return this;
    }

    public Sequence withCache(Long value) {
        setCache(value);
        return this;
    }

    public Sequence withComment(String value) {
        setComment(value);
        return this;
    }

    @Override
    public final void appendTo(XMLBuilder builder) {
        builder.append("sequence_catalog", sequenceCatalog);
        builder.append("sequence_schema", sequenceSchema);
        builder.append("sequence_name", sequenceName);
        builder.append("data_type", dataType);
        builder.append("character_maximum_length", characterMaximumLength);
        builder.append("numeric_precision", numericPrecision);
        builder.append("numeric_scale", numericScale);
        builder.append("start_with", startWith);
        builder.append("increment_by", incrementBy);
        builder.append("min_value", minValue);
        builder.append("max_value", maxValue);
        builder.append("cycle", cycle);
        builder.append("cache", cache);
        builder.append("comment", comment);
    }

    @Override
    public String toString() {
        XMLBuilder builder = XMLBuilder.nonFormatting();
        appendTo(builder);
        return builder.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass()!= that.getClass()) {
            return false;
        }
        Sequence other = ((Sequence) that);
        if (sequenceCatalog == null) {
            if (other.sequenceCatalog!= null) {
                return false;
            }
        } else {
            if (!sequenceCatalog.equals(other.sequenceCatalog)) {
                return false;
            }
        }
        if (sequenceSchema == null) {
            if (other.sequenceSchema!= null) {
                return false;
            }
        } else {
            if (!sequenceSchema.equals(other.sequenceSchema)) {
                return false;
            }
        }
        if (sequenceName == null) {
            if (other.sequenceName!= null) {
                return false;
            }
        } else {
            if (!sequenceName.equals(other.sequenceName)) {
                return false;
            }
        }
        if (dataType == null) {
            if (other.dataType!= null) {
                return false;
            }
        } else {
            if (!dataType.equals(other.dataType)) {
                return false;
            }
        }
        if (characterMaximumLength == null) {
            if (other.characterMaximumLength!= null) {
                return false;
            }
        } else {
            if (!characterMaximumLength.equals(other.characterMaximumLength)) {
                return false;
            }
        }
        if (numericPrecision == null) {
            if (other.numericPrecision!= null) {
                return false;
            }
        } else {
            if (!numericPrecision.equals(other.numericPrecision)) {
                return false;
            }
        }
        if (numericScale == null) {
            if (other.numericScale!= null) {
                return false;
            }
        } else {
            if (!numericScale.equals(other.numericScale)) {
                return false;
            }
        }
        if (startWith == null) {
            if (other.startWith!= null) {
                return false;
            }
        } else {
            if (!startWith.equals(other.startWith)) {
                return false;
            }
        }
        if (incrementBy == null) {
            if (other.incrementBy!= null) {
                return false;
            }
        } else {
            if (!incrementBy.equals(other.incrementBy)) {
                return false;
            }
        }
        if (minValue == null) {
            if (other.minValue!= null) {
                return false;
            }
        } else {
            if (!minValue.equals(other.minValue)) {
                return false;
            }
        }
        if (maxValue == null) {
            if (other.maxValue!= null) {
                return false;
            }
        } else {
            if (!maxValue.equals(other.maxValue)) {
                return false;
            }
        }
        if (cycle == null) {
            if (other.cycle!= null) {
                return false;
            }
        } else {
            if (!cycle.equals(other.cycle)) {
                return false;
            }
        }
        if (cache == null) {
            if (other.cache!= null) {
                return false;
            }
        } else {
            if (!cache.equals(other.cache)) {
                return false;
            }
        }
        if (comment == null) {
            if (other.comment!= null) {
                return false;
            }
        } else {
            if (!comment.equals(other.comment)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((sequenceCatalog == null)? 0 :sequenceCatalog.hashCode()));
        result = ((prime*result)+((sequenceSchema == null)? 0 :sequenceSchema.hashCode()));
        result = ((prime*result)+((sequenceName == null)? 0 :sequenceName.hashCode()));
        result = ((prime*result)+((dataType == null)? 0 :dataType.hashCode()));
        result = ((prime*result)+((characterMaximumLength == null)? 0 :characterMaximumLength.hashCode()));
        result = ((prime*result)+((numericPrecision == null)? 0 :numericPrecision.hashCode()));
        result = ((prime*result)+((numericScale == null)? 0 :numericScale.hashCode()));
        result = ((prime*result)+((startWith == null)? 0 :startWith.hashCode()));
        result = ((prime*result)+((incrementBy == null)? 0 :incrementBy.hashCode()));
        result = ((prime*result)+((minValue == null)? 0 :minValue.hashCode()));
        result = ((prime*result)+((maxValue == null)? 0 :maxValue.hashCode()));
        result = ((prime*result)+((cycle == null)? 0 :cycle.hashCode()));
        result = ((prime*result)+((cache == null)? 0 :cache.hashCode()));
        result = ((prime*result)+((comment == null)? 0 :comment.hashCode()));
        return result;
    }

}
