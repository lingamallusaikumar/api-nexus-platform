package com.apinexus.registry.massive.meshcache3203;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshCache3203Repository extends JpaRepository<MeshCache3203, Long> {
    MeshCache3203 findByName(String name);
}
