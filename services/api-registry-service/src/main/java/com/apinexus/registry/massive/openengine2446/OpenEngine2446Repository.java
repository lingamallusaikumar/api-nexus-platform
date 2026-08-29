package com.apinexus.registry.massive.openengine2446;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenEngine2446Repository extends JpaRepository<OpenEngine2446, Long> {
    OpenEngine2446 findByName(String name);
}
