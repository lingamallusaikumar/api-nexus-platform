package com.apinexus.registry.massive.autocache316;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoCache316Repository extends JpaRepository<AutoCache316, Long> {
    AutoCache316 findByName(String name);
}
