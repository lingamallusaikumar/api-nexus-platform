package com.apinexus.registry.massive.meshpool484;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshPool484Repository extends JpaRepository<MeshPool484, Long> {
    MeshPool484 findByName(String name);
}
