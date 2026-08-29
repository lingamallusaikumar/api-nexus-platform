package com.apinexus.registry.massive.edgelog2787;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeLog2787Repository extends JpaRepository<EdgeLog2787, Long> {
    EdgeLog2787 findByName(String name);
}
