package com.apinexus.registry.massive.proxyarray4888;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyArray4888Repository extends JpaRepository<ProxyArray4888, Long> {
    ProxyArray4888 findByName(String name);
}
