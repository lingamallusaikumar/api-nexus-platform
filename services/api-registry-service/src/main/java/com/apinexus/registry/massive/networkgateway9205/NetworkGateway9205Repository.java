package com.apinexus.registry.massive.networkgateway9205;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkGateway9205Repository extends JpaRepository<NetworkGateway9205, Long> {
    NetworkGateway9205 findByName(String name);
}
