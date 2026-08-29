package com.apinexus.registry.massive.meshengine4996;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshEngine4996Repository extends JpaRepository<MeshEngine4996, Long> {
    MeshEngine4996 findByName(String name);
}
