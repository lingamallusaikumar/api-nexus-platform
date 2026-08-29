package com.apinexus.registry.massive.meshworker3022;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshWorker3022Repository extends JpaRepository<MeshWorker3022, Long> {
    MeshWorker3022 findByName(String name);
}
