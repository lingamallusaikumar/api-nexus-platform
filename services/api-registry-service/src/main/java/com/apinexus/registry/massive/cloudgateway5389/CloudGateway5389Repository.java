package com.apinexus.registry.massive.cloudgateway5389;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudGateway5389Repository extends JpaRepository<CloudGateway5389, Long> {
    CloudGateway5389 findByName(String name);
}
