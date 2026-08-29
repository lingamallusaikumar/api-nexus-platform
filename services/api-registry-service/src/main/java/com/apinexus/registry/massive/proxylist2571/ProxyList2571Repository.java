package com.apinexus.registry.massive.proxylist2571;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyList2571Repository extends JpaRepository<ProxyList2571, Long> {
    ProxyList2571 findByName(String name);
}
