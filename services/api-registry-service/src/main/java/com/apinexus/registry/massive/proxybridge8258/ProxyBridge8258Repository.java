package com.apinexus.registry.massive.proxybridge8258;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyBridge8258Repository extends JpaRepository<ProxyBridge8258, Long> {
    ProxyBridge8258 findByName(String name);
}
