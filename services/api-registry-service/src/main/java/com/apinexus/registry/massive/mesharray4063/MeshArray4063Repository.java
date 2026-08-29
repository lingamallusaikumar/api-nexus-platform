package com.apinexus.registry.massive.mesharray4063;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshArray4063Repository extends JpaRepository<MeshArray4063, Long> {
    MeshArray4063 findByName(String name);
}
