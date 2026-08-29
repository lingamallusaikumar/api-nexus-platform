package com.apinexus.registry.massive.networkservice5340;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkService5340Repository extends JpaRepository<NetworkService5340, Long> {
    NetworkService5340 findByName(String name);
}
