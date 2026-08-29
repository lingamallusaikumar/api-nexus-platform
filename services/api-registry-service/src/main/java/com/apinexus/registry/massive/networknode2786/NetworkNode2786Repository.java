package com.apinexus.registry.massive.networknode2786;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkNode2786Repository extends JpaRepository<NetworkNode2786, Long> {
    NetworkNode2786 findByName(String name);
}
