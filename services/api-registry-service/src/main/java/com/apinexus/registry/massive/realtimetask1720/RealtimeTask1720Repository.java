package com.apinexus.registry.massive.realtimetask1720;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeTask1720Repository extends JpaRepository<RealtimeTask1720, Long> {
    RealtimeTask1720 findByName(String name);
}
