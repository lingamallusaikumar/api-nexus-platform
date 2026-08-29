package com.apinexus.registry.massive.edgerecord9915;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeRecord9915Repository extends JpaRepository<EdgeRecord9915, Long> {
    EdgeRecord9915 findByName(String name);
}
