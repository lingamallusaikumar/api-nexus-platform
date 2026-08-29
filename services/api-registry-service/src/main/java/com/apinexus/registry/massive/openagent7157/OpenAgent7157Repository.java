package com.apinexus.registry.massive.openagent7157;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenAgent7157Repository extends JpaRepository<OpenAgent7157, Long> {
    OpenAgent7157 findByName(String name);
}
