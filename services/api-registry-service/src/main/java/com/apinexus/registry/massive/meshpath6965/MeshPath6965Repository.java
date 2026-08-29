package com.apinexus.registry.massive.meshpath6965;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshPath6965Repository extends JpaRepository<MeshPath6965, Long> {
    MeshPath6965 findByName(String name);
}
