package com.apinexus.registry.massive.cloudarray4749;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudArray4749Repository extends JpaRepository<CloudArray4749, Long> {
    CloudArray4749 findByName(String name);
}
