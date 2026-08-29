package com.apinexus.registry.massive.edgerepo5804;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeRepo5804Repository extends JpaRepository<EdgeRepo5804, Long> {
    EdgeRepo5804 findByName(String name);
}
