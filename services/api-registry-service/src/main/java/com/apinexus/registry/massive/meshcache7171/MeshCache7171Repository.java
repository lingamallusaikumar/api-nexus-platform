package com.apinexus.registry.massive.meshcache7171;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshCache7171Repository extends JpaRepository<MeshCache7171, Long> {
    MeshCache7171 findByName(String name);
}
