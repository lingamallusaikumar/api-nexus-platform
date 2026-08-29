package com.apinexus.registry.massive.asyncedge9344;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncEdge9344Repository extends JpaRepository<AsyncEdge9344, Long> {
    AsyncEdge9344 findByName(String name);
}
