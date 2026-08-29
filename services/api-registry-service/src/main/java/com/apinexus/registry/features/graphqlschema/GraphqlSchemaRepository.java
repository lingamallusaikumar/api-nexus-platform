package com.apinexus.registry.features.graphqlschema;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphqlSchemaRepository extends JpaRepository<GraphqlSchema, Long> {
    GraphqlSchema findByName(String name);
}
