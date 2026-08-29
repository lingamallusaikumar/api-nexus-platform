package com.apinexus.registry.massive.hubroute9995;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubRoute9995Repository extends JpaRepository<HubRoute9995, Long> {
    HubRoute9995 findByName(String name);
}
