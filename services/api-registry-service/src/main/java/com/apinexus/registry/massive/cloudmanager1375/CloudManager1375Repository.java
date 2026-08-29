package com.apinexus.registry.massive.cloudmanager1375;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudManager1375Repository extends JpaRepository<CloudManager1375, Long> {
    CloudManager1375 findByName(String name);
}
