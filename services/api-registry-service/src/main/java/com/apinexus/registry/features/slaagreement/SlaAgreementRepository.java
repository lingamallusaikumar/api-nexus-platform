package com.apinexus.registry.features.slaagreement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlaAgreementRepository extends JpaRepository<SlaAgreement, Long> {
    SlaAgreement findByName(String name);
}
