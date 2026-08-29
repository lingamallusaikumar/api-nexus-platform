package com.apinexus.registry.massive.globalpool8080;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalPool8080Repository extends JpaRepository<GlobalPool8080, Long> {
    GlobalPool8080 findByName(String name);
}
