package com.apinexus.registry.massive.proxysystem8828;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxySystem8828Repository extends JpaRepository<ProxySystem8828, Long> {
    ProxySystem8828 findByName(String name);
}
