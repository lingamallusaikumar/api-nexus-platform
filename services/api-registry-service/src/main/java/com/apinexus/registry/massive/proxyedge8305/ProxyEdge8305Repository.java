package com.apinexus.registry.massive.proxyedge8305;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyEdge8305Repository extends JpaRepository<ProxyEdge8305, Long> {
    ProxyEdge8305 findByName(String name);
}
