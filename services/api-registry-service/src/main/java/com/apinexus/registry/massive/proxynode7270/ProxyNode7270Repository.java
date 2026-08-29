package com.apinexus.registry.massive.proxynode7270;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyNode7270Repository extends JpaRepository<ProxyNode7270, Long> {
    ProxyNode7270 findByName(String name);
}
