package com.apinexus.registry.massive.cloudnode7330;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudNode7330Repository extends JpaRepository<CloudNode7330, Long> {
    CloudNode7330 findByName(String name);
}
