package com.apinexus.registry.massive.edgeset9408;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeSet9408Repository extends JpaRepository<EdgeSet9408, Long> {
    EdgeSet9408 findByName(String name);
}
