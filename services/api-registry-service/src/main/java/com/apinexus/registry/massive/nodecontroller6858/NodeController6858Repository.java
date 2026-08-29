package com.apinexus.registry.massive.nodecontroller6858;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeController6858Repository extends JpaRepository<NodeController6858, Long> {
    NodeController6858 findByName(String name);
}
