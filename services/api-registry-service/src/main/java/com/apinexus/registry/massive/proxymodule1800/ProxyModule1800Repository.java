package com.apinexus.registry.massive.proxymodule1800;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyModule1800Repository extends JpaRepository<ProxyModule1800, Long> {
    ProxyModule1800 findByName(String name);
}
