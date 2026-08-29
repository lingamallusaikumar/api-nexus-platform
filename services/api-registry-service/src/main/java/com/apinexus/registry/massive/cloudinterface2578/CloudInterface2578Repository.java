package com.apinexus.registry.massive.cloudinterface2578;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudInterface2578Repository extends JpaRepository<CloudInterface2578, Long> {
    CloudInterface2578 findByName(String name);
}
