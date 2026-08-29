package com.apinexus.registry.massive.openagent9839;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenAgent9839Repository extends JpaRepository<OpenAgent9839, Long> {
    OpenAgent9839 findByName(String name);
}
