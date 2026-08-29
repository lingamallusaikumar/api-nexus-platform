package com.apinexus.registry.massive.hubgateway210;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubGateway210Repository extends JpaRepository<HubGateway210, Long> {
    HubGateway210 findByName(String name);
}
