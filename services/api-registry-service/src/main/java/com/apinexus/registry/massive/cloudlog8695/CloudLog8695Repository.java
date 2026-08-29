package com.apinexus.registry.massive.cloudlog8695;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudLog8695Repository extends JpaRepository<CloudLog8695, Long> {
    CloudLog8695 findByName(String name);
}
