package com.apinexus.registry.massive.networkset4464;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkSet4464Repository extends JpaRepository<NetworkSet4464, Long> {
    NetworkSet4464 findByName(String name);
}
