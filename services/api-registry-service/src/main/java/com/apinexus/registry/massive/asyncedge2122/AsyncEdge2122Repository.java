package com.apinexus.registry.massive.asyncedge2122;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncEdge2122Repository extends JpaRepository<AsyncEdge2122, Long> {
    AsyncEdge2122 findByName(String name);
}
