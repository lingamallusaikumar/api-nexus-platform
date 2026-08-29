package com.apinexus.registry.features.systemmetric;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemMetricRepository extends JpaRepository<SystemMetric, Long> {
    SystemMetric findByName(String name);
}
