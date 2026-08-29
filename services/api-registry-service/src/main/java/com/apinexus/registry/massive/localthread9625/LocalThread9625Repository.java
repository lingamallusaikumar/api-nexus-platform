package com.apinexus.registry.massive.localthread9625;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalThread9625Repository extends JpaRepository<LocalThread9625, Long> {
    LocalThread9625 findByName(String name);
}
