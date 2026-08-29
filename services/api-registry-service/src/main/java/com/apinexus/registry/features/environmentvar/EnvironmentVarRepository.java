package com.apinexus.registry.features.environmentvar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentVarRepository extends JpaRepository<EnvironmentVar, Long> {
    EnvironmentVar findByName(String name);
}
