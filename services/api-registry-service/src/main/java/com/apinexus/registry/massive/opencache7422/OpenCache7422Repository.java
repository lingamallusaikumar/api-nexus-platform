package com.apinexus.registry.massive.opencache7422;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenCache7422Repository extends JpaRepository<OpenCache7422, Long> {
    OpenCache7422 findByName(String name);
}
