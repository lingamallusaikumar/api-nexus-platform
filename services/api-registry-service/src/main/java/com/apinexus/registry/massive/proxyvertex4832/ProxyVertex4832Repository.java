package com.apinexus.registry.massive.proxyvertex4832;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyVertex4832Repository extends JpaRepository<ProxyVertex4832, Long> {
    ProxyVertex4832 findByName(String name);
}
