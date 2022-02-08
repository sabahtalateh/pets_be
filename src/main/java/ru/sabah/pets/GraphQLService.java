package ru.sabah.pets;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

import javax.inject.Inject;

@GraphQLApi
public class GraphQLService {

    @Inject
    Service service;

    @Inject
    @ConfigProperty(name = "db.port")
    String p;

    @Query("hello")
    @NonNull
    public String hello(@Parameter Long n) {
        Smth gegt = service.gegt(n);
        return gegt.getName();
    }
}