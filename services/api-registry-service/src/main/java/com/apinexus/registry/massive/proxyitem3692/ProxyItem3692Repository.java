package com.apinexus.registry.massive.proxyitem3692;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyItem3692Repository extends JpaRepository<ProxyItem3692, Long> {
    ProxyItem3692 findByName(String name);
}
