package com.apinexus.registry.massive.autocache8196;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoCache8196Repository extends JpaRepository<AutoCache8196, Long> {
    AutoCache8196 findByName(String name);
}
