package com.apinexus.registry.massive.meshmap8708;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshMap8708Repository extends JpaRepository<MeshMap8708, Long> {
    MeshMap8708 findByName(String name);
}
