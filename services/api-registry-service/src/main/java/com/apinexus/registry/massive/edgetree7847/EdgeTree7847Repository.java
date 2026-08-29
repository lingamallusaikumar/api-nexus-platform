package com.apinexus.registry.massive.edgetree7847;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeTree7847Repository extends JpaRepository<EdgeTree7847, Long> {
    EdgeTree7847 findByName(String name);
}
