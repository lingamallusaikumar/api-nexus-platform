package com.apinexus.registry.massive.virtualtask9944;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualTask9944Repository extends JpaRepository<VirtualTask9944, Long> {
    VirtualTask9944 findByName(String name);
}
