package com.apinexus.registry.massive.realtimeservice4991;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeService4991Repository extends JpaRepository<RealtimeService4991, Long> {
    RealtimeService4991 findByName(String name);
}
