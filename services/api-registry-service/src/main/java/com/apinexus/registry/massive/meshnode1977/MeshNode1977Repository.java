package com.apinexus.registry.massive.meshnode1977;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshNode1977Repository extends JpaRepository<MeshNode1977, Long> {
    MeshNode1977 findByName(String name);
}
