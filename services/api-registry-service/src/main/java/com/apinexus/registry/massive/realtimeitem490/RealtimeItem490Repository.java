package com.apinexus.registry.massive.realtimeitem490;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeItem490Repository extends JpaRepository<RealtimeItem490, Long> {
    RealtimeItem490 findByName(String name);
}
