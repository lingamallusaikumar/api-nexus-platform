package com.apinexus.registry.massive.autoservice1941;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoService1941Repository extends JpaRepository<AutoService1941, Long> {
    AutoService1941 findByName(String name);
}
