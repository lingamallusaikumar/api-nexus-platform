package com.apinexus.registry.massive.meshworker8358;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshWorker8358Repository extends JpaRepository<MeshWorker8358, Long> {
    MeshWorker8358 findByName(String name);
}
