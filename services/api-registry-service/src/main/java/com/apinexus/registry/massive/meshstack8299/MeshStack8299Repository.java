package com.apinexus.registry.massive.meshstack8299;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshStack8299Repository extends JpaRepository<MeshStack8299, Long> {
    MeshStack8299 findByName(String name);
}
