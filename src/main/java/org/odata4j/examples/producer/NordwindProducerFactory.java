package org.odata4j.examples.producer;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.odata4j.producer.ODataProducer;
import org.odata4j.producer.ODataProducerFactory;
import org.odata4j.producer.jpa.JPAProducer;



public class NordwindProducerFactory implements ODataProducerFactory {

    private String persistenceUnitName = "NorthwindService";
    private String namespace = "Northwind";
    private int maxResults = 50;

    @Override
    public ODataProducer create(final Properties arg0) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                persistenceUnitName);
        emf.createEntityManager();
        
        

        JPAProducer producer = new JPAProducer(
                emf,
                namespace,
                maxResults);
        //producer.register()
        
        return producer;
    }
}
