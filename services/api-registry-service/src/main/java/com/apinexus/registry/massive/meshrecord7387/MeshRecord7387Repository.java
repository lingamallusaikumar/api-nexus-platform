package com.apinexus.registry.massive.meshrecord7387;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshRecord7387Repository extends JpaRepository<MeshRecord7387, Long> {
    MeshRecord7387 findByName(String name);
}
