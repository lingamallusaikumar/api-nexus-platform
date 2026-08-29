package com.apinexus.registry.massive.staticroute6066;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticRoute6066Repository extends JpaRepository<StaticRoute6066, Long> {
    StaticRoute6066 findByName(String name);
}
