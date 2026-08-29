package com.apinexus.registry.massive.nodecontroller6820;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeController6820Repository extends JpaRepository<NodeController6820, Long> {
    NodeController6820 findByName(String name);
}
