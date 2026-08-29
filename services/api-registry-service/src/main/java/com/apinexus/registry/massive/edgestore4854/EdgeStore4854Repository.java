package com.apinexus.registry.massive.edgestore4854;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeStore4854Repository extends JpaRepository<EdgeStore4854, Long> {
    EdgeStore4854 findByName(String name);
}
