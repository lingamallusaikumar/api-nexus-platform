package com.apinexus.registry.massive.realtimerepo1276;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeRepo1276Repository extends JpaRepository<RealtimeRepo1276, Long> {
    RealtimeRepo1276 findByName(String name);
}
