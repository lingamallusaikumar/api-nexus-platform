package com.apinexus.registry.massive.realtimeset8651;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeSet8651Repository extends JpaRepository<RealtimeSet8651, Long> {
    RealtimeSet8651 findByName(String name);
}
