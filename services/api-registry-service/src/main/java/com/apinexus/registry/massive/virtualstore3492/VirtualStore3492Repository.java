package com.apinexus.registry.massive.virtualstore3492;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualStore3492Repository extends JpaRepository<VirtualStore3492, Long> {
    VirtualStore3492 findByName(String name);
}
