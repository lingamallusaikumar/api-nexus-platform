package com.apinexus.registry.features.securitypolicy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityPolicyRepository extends JpaRepository<SecurityPolicy, Long> {
    SecurityPolicy findByName(String name);
}
