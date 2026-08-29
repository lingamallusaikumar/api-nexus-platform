package com.apinexus.registry.features.samlidp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SamlIdpRepository extends JpaRepository<SamlIdp, Long> {
    SamlIdp findByName(String name);
}
