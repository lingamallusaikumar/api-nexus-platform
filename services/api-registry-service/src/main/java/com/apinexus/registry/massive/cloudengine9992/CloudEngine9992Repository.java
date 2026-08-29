package com.apinexus.registry.massive.cloudengine9992;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudEngine9992Repository extends JpaRepository<CloudEngine9992, Long> {
    CloudEngine9992 findByName(String name);
}
