package ru.sabah.pets;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class Service {

    @Inject
    @ConfigProperty(name = "message")
    private String message;

    @PersistenceContext(name = "main")
    private EntityManager em;

    public String greet() {
        return message;
    }

    public Smth gegt(Long id) {
        return em.find(Smth.class, id);
    }
}
