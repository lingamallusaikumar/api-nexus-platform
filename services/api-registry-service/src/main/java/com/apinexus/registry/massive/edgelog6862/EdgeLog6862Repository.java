package com.apinexus.registry.massive.edgelog6862;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeLog6862Repository extends JpaRepository<EdgeLog6862, Long> {
    EdgeLog6862 findByName(String name);
}
