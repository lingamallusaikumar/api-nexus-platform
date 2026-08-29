package com.apinexus.registry.massive.networkcontroller6557;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkController6557Repository extends JpaRepository<NetworkController6557, Long> {
    NetworkController6557 findByName(String name);
}
