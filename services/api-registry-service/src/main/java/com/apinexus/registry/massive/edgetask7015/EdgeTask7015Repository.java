package com.apinexus.registry.massive.edgetask7015;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeTask7015Repository extends JpaRepository<EdgeTask7015, Long> {
    EdgeTask7015 findByName(String name);
}
