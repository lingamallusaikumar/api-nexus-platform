package com.apinexus.registry.massive.cloudpath3533;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudPath3533Repository extends JpaRepository<CloudPath3533, Long> {
    CloudPath3533 findByName(String name);
}
