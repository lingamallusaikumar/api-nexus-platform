package com.apinexus.registry.massive.offlineedge4020;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineEdge4020Repository extends JpaRepository<OfflineEdge4020, Long> {
    OfflineEdge4020 findByName(String name);
}
