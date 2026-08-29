package com.apinexus.registry.massive.proxybridge412;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyBridge412Repository extends JpaRepository<ProxyBridge412, Long> {
    ProxyBridge412 findByName(String name);
}
