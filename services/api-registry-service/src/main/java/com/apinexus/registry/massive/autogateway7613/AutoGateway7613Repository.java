package com.apinexus.registry.massive.autogateway7613;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoGateway7613Repository extends JpaRepository<AutoGateway7613, Long> {
    AutoGateway7613 findByName(String name);
}
