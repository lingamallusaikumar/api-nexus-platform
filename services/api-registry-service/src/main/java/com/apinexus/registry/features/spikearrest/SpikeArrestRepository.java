package com.apinexus.registry.features.spikearrest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpikeArrestRepository extends JpaRepository<SpikeArrest, Long> {
    SpikeArrest findByName(String name);
}
