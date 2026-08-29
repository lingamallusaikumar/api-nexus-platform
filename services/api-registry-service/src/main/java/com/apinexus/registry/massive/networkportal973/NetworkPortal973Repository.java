package com.apinexus.registry.massive.networkportal973;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkPortal973Repository extends JpaRepository<NetworkPortal973, Long> {
    NetworkPortal973 findByName(String name);
}
