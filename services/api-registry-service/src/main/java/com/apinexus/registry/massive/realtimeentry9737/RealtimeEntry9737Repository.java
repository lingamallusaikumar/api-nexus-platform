package com.apinexus.registry.massive.realtimeentry9737;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeEntry9737Repository extends JpaRepository<RealtimeEntry9737, Long> {
    RealtimeEntry9737 findByName(String name);
}
