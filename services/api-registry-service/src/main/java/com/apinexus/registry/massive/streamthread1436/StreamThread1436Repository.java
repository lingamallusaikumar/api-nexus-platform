package com.apinexus.registry.massive.streamthread1436;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamThread1436Repository extends JpaRepository<StreamThread1436, Long> {
    StreamThread1436 findByName(String name);
}
