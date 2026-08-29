package com.apinexus.registry.massive.regionqueue1618;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionQueue1618Repository extends JpaRepository<RegionQueue1618, Long> {
    RegionQueue1618 findByName(String name);
}
