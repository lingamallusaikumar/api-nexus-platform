package com.apinexus.registry.massive.openengine5379;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenEngine5379Repository extends JpaRepository<OpenEngine5379, Long> {
    OpenEngine5379 findByName(String name);
}
