package com.apinexus.registry.massive.realtimeprocessor6540;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeProcessor6540Repository extends JpaRepository<RealtimeProcessor6540, Long> {
    RealtimeProcessor6540 findByName(String name);
}
