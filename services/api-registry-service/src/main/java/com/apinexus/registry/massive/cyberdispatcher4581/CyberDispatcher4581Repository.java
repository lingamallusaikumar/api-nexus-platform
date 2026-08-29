package com.apinexus.registry.massive.cyberdispatcher4581;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberDispatcher4581Repository extends JpaRepository<CyberDispatcher4581, Long> {
    CyberDispatcher4581 findByName(String name);
}
