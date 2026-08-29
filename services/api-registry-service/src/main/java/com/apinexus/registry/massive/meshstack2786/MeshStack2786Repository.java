package com.apinexus.registry.massive.meshstack2786;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshStack2786Repository extends JpaRepository<MeshStack2786, Long> {
    MeshStack2786 findByName(String name);
}
