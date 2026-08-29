package com.apinexus.registry.features.quotaallocation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotaAllocationRepository extends JpaRepository<QuotaAllocation, Long> {
    QuotaAllocation findByName(String name);
}
