package com.apinexus.registry.massive.proxyinterface9546;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyInterface9546Repository extends JpaRepository<ProxyInterface9546, Long> {
    ProxyInterface9546 findByName(String name);
}
