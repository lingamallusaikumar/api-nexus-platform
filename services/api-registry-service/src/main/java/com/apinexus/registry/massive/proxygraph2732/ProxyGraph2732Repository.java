package com.apinexus.registry.massive.proxygraph2732;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyGraph2732Repository extends JpaRepository<ProxyGraph2732, Long> {
    ProxyGraph2732 findByName(String name);
}
