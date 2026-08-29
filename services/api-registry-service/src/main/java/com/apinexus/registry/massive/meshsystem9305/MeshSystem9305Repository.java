package com.apinexus.registry.massive.meshsystem9305;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshSystem9305Repository extends JpaRepository<MeshSystem9305, Long> {
    MeshSystem9305 findByName(String name);
}
