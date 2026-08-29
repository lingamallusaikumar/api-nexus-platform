package com.apinexus.registry.massive.nodejob8838;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeJob8838Repository extends JpaRepository<NodeJob8838, Long> {
    NodeJob8838 findByName(String name);
}
