package com.apinexus.registry.massive.cloudcontroller292;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudController292Repository extends JpaRepository<CloudController292, Long> {
    CloudController292 findByName(String name);
}
