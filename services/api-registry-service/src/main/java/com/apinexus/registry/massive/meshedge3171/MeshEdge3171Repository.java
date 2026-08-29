package com.apinexus.registry.massive.meshedge3171;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshEdge3171Repository extends JpaRepository<MeshEdge3171, Long> {
    MeshEdge3171 findByName(String name);
}
