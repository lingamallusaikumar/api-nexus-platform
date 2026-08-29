package com.apinexus.registry.massive.openbuffer7280;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenBuffer7280Repository extends JpaRepository<OpenBuffer7280, Long> {
    OpenBuffer7280 findByName(String name);
}
