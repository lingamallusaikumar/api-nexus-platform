package com.apinexus.registry.massive.edgedatabase1823;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeDatabase1823Repository extends JpaRepository<EdgeDatabase1823, Long> {
    EdgeDatabase1823 findByName(String name);
}
