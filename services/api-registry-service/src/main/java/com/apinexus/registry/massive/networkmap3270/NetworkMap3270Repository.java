package com.apinexus.registry.massive.networkmap3270;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkMap3270Repository extends JpaRepository<NetworkMap3270, Long> {
    NetworkMap3270 findByName(String name);
}
