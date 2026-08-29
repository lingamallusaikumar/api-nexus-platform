package com.apinexus.registry.massive.localpool5742;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalPool5742Repository extends JpaRepository<LocalPool5742, Long> {
    LocalPool5742 findByName(String name);
}
