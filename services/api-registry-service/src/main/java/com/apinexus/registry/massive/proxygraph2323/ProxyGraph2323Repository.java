package com.apinexus.registry.massive.proxygraph2323;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyGraph2323Repository extends JpaRepository<ProxyGraph2323, Long> {
    ProxyGraph2323 findByName(String name);
}
