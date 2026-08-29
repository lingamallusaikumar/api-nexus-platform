package com.apinexus.registry.features.restorepoint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestorePointRepository extends JpaRepository<RestorePoint, Long> {
    RestorePoint findByName(String name);
}
