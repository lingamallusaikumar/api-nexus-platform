package com.apinexus.registry.massive.proxylist637;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyList637Repository extends JpaRepository<ProxyList637, Long> {
    ProxyList637 findByName(String name);
}
