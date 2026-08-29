package com.apinexus.registry.massive.digitalroute6286;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalRoute6286Repository extends JpaRepository<DigitalRoute6286, Long> {
    DigitalRoute6286 findByName(String name);
}
