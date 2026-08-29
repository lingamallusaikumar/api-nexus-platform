package com.apinexus.registry.massive.meshitem1607;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshItem1607Repository extends JpaRepository<MeshItem1607, Long> {
    MeshItem1607 findByName(String name);
}
