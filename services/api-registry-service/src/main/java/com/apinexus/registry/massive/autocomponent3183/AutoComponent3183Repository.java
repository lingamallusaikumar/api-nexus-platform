package com.apinexus.registry.massive.autocomponent3183;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoComponent3183Repository extends JpaRepository<AutoComponent3183, Long> {
    AutoComponent3183 findByName(String name);
}
