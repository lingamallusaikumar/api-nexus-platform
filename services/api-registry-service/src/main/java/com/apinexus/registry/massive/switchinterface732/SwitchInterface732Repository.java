package com.apinexus.registry.massive.switchinterface732;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchInterface732Repository extends JpaRepository<SwitchInterface732, Long> {
    SwitchInterface732 findByName(String name);
}
