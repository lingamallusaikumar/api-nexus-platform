package com.apinexus.registry.massive.networkset4000;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkSet4000Repository extends JpaRepository<NetworkSet4000, Long> {
    NetworkSet4000 findByName(String name);
}
