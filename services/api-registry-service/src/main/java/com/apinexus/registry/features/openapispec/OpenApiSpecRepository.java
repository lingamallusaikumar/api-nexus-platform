package com.apinexus.registry.features.openapispec;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenApiSpecRepository extends JpaRepository<OpenApiSpec, Long> {
    OpenApiSpec findByName(String name);
}
