package com.apinexus.registry.massive.proxyroute474;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyRoute474Repository extends JpaRepository<ProxyRoute474, Long> {
    ProxyRoute474 findByName(String name);
}
