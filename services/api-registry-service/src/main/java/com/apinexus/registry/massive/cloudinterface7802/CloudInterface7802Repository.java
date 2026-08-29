package com.apinexus.registry.massive.cloudinterface7802;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudInterface7802Repository extends JpaRepository<CloudInterface7802, Long> {
    CloudInterface7802 findByName(String name);
}
