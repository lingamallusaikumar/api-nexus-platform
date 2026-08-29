package com.apinexus.registry.features.ratelimitpolicy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateLimitPolicyRepository extends JpaRepository<RateLimitPolicy, Long> {
    RateLimitPolicy findByName(String name);
}
