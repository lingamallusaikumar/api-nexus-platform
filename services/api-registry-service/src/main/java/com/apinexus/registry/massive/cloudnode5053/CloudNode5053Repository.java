package com.apinexus.registry.massive.cloudnode5053;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudNode5053Repository extends JpaRepository<CloudNode5053, Long> {
    CloudNode5053 findByName(String name);
}
