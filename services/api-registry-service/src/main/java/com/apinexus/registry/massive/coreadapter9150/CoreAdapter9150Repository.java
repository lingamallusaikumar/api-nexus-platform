package com.apinexus.registry.massive.coreadapter9150;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreAdapter9150Repository extends JpaRepository<CoreAdapter9150, Long> {
    CoreAdapter9150 findByName(String name);
}
