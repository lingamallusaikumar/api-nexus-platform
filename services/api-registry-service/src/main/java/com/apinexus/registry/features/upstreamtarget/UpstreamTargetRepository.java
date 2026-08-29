package com.apinexus.registry.features.upstreamtarget;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpstreamTargetRepository extends JpaRepository<UpstreamTarget, Long> {
    UpstreamTarget findByName(String name);
}
