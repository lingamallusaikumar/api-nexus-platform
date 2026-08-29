package com.apinexus.registry.massive.realtimecache1225;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeCache1225Repository extends JpaRepository<RealtimeCache1225, Long> {
    RealtimeCache1225 findByName(String name);
}
