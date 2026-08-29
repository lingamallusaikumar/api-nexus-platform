package com.apinexus.registry.features.analyticevent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticEventRepository extends JpaRepository<AnalyticEvent, Long> {
    AnalyticEvent findByName(String name);
}
