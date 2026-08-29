package com.apinexus.registry.features.corspolicy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorsPolicyRepository extends JpaRepository<CorsPolicy, Long> {
    CorsPolicy findByName(String name);
}
