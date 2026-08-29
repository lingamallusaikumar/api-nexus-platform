package com.apinexus.registry.massive.proxyset2432;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxySet2432Repository extends JpaRepository<ProxySet2432, Long> {
    ProxySet2432 findByName(String name);
}
