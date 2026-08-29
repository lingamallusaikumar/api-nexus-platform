package com.apinexus.registry.massive.switchlog5582;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchLog5582Repository extends JpaRepository<SwitchLog5582, Long> {
    SwitchLog5582 findByName(String name);
}
