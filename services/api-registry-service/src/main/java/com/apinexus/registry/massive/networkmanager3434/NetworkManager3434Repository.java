package com.apinexus.registry.massive.networkmanager3434;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkManager3434Repository extends JpaRepository<NetworkManager3434, Long> {
    NetworkManager3434 findByName(String name);
}
