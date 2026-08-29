package com.apinexus.registry.massive.realtimeitem737;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeItem737Repository extends JpaRepository<RealtimeItem737, Long> {
    RealtimeItem737 findByName(String name);
}
