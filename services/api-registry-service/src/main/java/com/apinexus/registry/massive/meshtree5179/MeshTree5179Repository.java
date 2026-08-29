package com.apinexus.registry.massive.meshtree5179;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshTree5179Repository extends JpaRepository<MeshTree5179, Long> {
    MeshTree5179 findByName(String name);
}
