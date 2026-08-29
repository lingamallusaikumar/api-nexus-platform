package com.apinexus.registry.features.tenantconfig;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantConfigRepository extends JpaRepository<TenantConfig, Long> {
    TenantConfig findByName(String name);
}
