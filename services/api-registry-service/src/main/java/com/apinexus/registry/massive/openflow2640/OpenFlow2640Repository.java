package com.apinexus.registry.massive.openflow2640;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenFlow2640Repository extends JpaRepository<OpenFlow2640, Long> {
    OpenFlow2640 findByName(String name);
}
