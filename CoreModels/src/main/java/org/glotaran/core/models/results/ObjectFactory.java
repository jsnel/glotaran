//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.24 at 12:12:25 PM CET 
//
package org.glotaran.core.models.results;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.glotaran.core.model.results package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.glotaran.core.model.results
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatasetRelation }
     * 
     */
    public DatasetRelation createDatasetRelation() {
        return new DatasetRelation();
    }

    /**
     * Create an instance of {@link Dataset }
     * 
     */
    public Dataset createDataset() {
        return new Dataset();
    }

    /**
     * Create an instance of {@link GtaResult }
     * 
     */
    public GtaResult createGtaResult() {
        return new GtaResult();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link OutputFile }
     * 
     */
    public OutputFile createOutputFile() {
        return new OutputFile();
    }

    /**
     * Create an instance of {@link NlsProgress }
     * 
     */
    public NlsProgress createNlsProgress() {
        return new NlsProgress();
    }

    /**
     * Create an instance of {@link Summary }
     * 
     */
    public Summary createSummary() {
        return new Summary();
    }
}
