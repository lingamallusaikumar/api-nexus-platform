package com.apinexus.registry.features.apiversion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiVersionRepository extends JpaRepository<ApiVersion, Long> {
    ApiVersion findByName(String name);
}
