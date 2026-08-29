package com.apinexus.registry.massive.realtimenode6372;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeNode6372Repository extends JpaRepository<RealtimeNode6372, Long> {
    RealtimeNode6372 findByName(String name);
}
