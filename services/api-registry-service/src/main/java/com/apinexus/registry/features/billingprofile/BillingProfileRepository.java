package com.apinexus.registry.features.billingprofile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingProfileRepository extends JpaRepository<BillingProfile, Long> {
    BillingProfile findByName(String name);
}
