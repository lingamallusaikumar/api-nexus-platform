package com.apinexus.registry.massive.edgeservice5458;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeService5458Repository extends JpaRepository<EdgeService5458, Long> {
    EdgeService5458 findByName(String name);
}
