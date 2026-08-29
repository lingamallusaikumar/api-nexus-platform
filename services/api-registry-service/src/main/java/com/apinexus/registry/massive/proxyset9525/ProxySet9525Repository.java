package com.apinexus.registry.massive.proxyset9525;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxySet9525Repository extends JpaRepository<ProxySet9525, Long> {
    ProxySet9525 findByName(String name);
}
