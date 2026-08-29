package com.apinexus.registry.massive.edgecomponent9447;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeComponent9447Repository extends JpaRepository<EdgeComponent9447, Long> {
    EdgeComponent9447 findByName(String name);
}
