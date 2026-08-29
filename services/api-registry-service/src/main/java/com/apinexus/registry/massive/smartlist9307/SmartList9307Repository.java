package com.apinexus.registry.massive.smartlist9307;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartList9307Repository extends JpaRepository<SmartList9307, Long> {
    SmartList9307 findByName(String name);
}
