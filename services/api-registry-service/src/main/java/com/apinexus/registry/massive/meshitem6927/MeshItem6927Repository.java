package com.apinexus.registry.massive.meshitem6927;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshItem6927Repository extends JpaRepository<MeshItem6927, Long> {
    MeshItem6927 findByName(String name);
}
