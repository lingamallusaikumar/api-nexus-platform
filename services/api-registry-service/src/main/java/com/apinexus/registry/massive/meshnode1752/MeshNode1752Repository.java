package com.apinexus.registry.massive.meshnode1752;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshNode1752Repository extends JpaRepository<MeshNode1752, Long> {
    MeshNode1752 findByName(String name);
}
