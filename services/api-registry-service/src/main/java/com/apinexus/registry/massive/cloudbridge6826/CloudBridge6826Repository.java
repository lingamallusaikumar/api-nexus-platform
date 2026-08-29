package com.apinexus.registry.massive.cloudbridge6826;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudBridge6826Repository extends JpaRepository<CloudBridge6826, Long> {
    CloudBridge6826 findByName(String name);
}
