package com.apinexus.registry.massive.smartqueue975;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartQueue975Repository extends JpaRepository<SmartQueue975, Long> {
    SmartQueue975 findByName(String name);
}
