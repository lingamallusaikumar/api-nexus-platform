package com.apinexus.registry.massive.zonegraph5960;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneGraph5960Repository extends JpaRepository<ZoneGraph5960, Long> {
    ZoneGraph5960 findByName(String name);
}
