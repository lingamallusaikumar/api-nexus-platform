package com.apinexus.registry.massive.proxystack3558;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyStack3558Repository extends JpaRepository<ProxyStack3558, Long> {
    ProxyStack3558 findByName(String name);
}
