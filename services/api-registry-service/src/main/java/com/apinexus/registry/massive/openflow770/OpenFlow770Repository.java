package com.apinexus.registry.massive.openflow770;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenFlow770Repository extends JpaRepository<OpenFlow770, Long> {
    OpenFlow770 findByName(String name);
}
