package com.apinexus.registry.massive.remotegateway251;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteGateway251Repository extends JpaRepository<RemoteGateway251, Long> {
    RemoteGateway251 findByName(String name);
}
