package com.apinexus.registry.massive.localengine857;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalEngine857Repository extends JpaRepository<LocalEngine857, Long> {
    LocalEngine857 findByName(String name);
}
