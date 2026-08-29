package com.apinexus.registry.features.cachepolicy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CachePolicyRepository extends JpaRepository<CachePolicy, Long> {
    CachePolicy findByName(String name);
}
