package com.apinexus.registry.massive.automanager862;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoManager862Repository extends JpaRepository<AutoManager862, Long> {
    AutoManager862 findByName(String name);
}
