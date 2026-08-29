package com.apinexus.registry.massive.virtualjob9029;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualJob9029Repository extends JpaRepository<VirtualJob9029, Long> {
    VirtualJob9029 findByName(String name);
}
