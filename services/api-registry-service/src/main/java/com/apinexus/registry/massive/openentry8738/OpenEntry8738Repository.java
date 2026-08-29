package com.apinexus.registry.massive.openentry8738;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenEntry8738Repository extends JpaRepository<OpenEntry8738, Long> {
    OpenEntry8738 findByName(String name);
}
