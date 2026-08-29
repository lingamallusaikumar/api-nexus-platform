package com.apinexus.registry.massive.closedlog6883;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedLog6883Repository extends JpaRepository<ClosedLog6883, Long> {
    ClosedLog6883 findByName(String name);
}
