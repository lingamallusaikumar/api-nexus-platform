package com.apinexus.registry.massive.cloudportal3712;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudPortal3712Repository extends JpaRepository<CloudPortal3712, Long> {
    CloudPortal3712 findByName(String name);
}
