package com.apinexus.registry.massive.offlineroute5142;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineRoute5142Repository extends JpaRepository<OfflineRoute5142, Long> {
    OfflineRoute5142 findByName(String name);
}
