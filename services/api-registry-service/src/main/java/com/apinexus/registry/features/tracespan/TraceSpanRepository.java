package com.apinexus.registry.features.tracespan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraceSpanRepository extends JpaRepository<TraceSpan, Long> {
    TraceSpan findByName(String name);
}
