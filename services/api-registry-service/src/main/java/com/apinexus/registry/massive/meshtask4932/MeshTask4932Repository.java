package com.apinexus.registry.massive.meshtask4932;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshTask4932Repository extends JpaRepository<MeshTask4932, Long> {
    MeshTask4932 findByName(String name);
}
