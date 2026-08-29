package com.apinexus.registry.massive.meshpool3974;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshPool3974Repository extends JpaRepository<MeshPool3974, Long> {
    MeshPool3974 findByName(String name);
}
