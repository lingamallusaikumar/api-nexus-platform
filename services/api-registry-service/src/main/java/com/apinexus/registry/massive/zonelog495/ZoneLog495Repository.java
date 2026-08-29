package com.apinexus.registry.massive.zonelog495;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneLog495Repository extends JpaRepository<ZoneLog495, Long> {
    ZoneLog495 findByName(String name);
}
