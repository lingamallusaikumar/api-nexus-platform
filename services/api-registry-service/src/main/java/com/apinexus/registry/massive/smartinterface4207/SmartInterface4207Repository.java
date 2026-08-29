package com.apinexus.registry.massive.smartinterface4207;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartInterface4207Repository extends JpaRepository<SmartInterface4207, Long> {
    SmartInterface4207 findByName(String name);
}
