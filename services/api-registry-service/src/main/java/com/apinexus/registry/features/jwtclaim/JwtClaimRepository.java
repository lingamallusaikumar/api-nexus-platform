package com.apinexus.registry.features.jwtclaim;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JwtClaimRepository extends JpaRepository<JwtClaim, Long> {
    JwtClaim findByName(String name);
}
