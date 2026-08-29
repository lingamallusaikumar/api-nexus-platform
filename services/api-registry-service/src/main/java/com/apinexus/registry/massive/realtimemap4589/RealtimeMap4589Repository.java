package com.apinexus.registry.massive.realtimemap4589;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeMap4589Repository extends JpaRepository<RealtimeMap4589, Long> {
    RealtimeMap4589 findByName(String name);
}
