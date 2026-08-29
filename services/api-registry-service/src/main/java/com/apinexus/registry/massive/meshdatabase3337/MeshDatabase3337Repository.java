package com.apinexus.registry.massive.meshdatabase3337;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshDatabase3337Repository extends JpaRepository<MeshDatabase3337, Long> {
    MeshDatabase3337 findByName(String name);
}
