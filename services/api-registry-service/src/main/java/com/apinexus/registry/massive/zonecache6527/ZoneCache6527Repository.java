package com.apinexus.registry.massive.zonecache6527;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneCache6527Repository extends JpaRepository<ZoneCache6527, Long> {
    ZoneCache6527 findByName(String name);
}
