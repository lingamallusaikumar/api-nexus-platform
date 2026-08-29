package com.apinexus.registry.massive.cloudgraph9671;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudGraph9671Repository extends JpaRepository<CloudGraph9671, Long> {
    CloudGraph9671 findByName(String name);
}
