package com.apinexus.registry.massive.networkstore7210;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkStore7210Repository extends JpaRepository<NetworkStore7210, Long> {
    NetworkStore7210 findByName(String name);
}
