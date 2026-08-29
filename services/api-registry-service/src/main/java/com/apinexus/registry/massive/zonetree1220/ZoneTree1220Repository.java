package com.apinexus.registry.massive.zonetree1220;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneTree1220Repository extends JpaRepository<ZoneTree1220, Long> {
    ZoneTree1220 findByName(String name);
}
