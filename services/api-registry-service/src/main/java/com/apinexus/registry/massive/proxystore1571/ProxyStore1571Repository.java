package com.apinexus.registry.massive.proxystore1571;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyStore1571Repository extends JpaRepository<ProxyStore1571, Long> {
    ProxyStore1571 findByName(String name);
}
