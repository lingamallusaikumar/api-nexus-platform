package com.apinexus.registry.massive.asyncedge7815;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncEdge7815Repository extends JpaRepository<AsyncEdge7815, Long> {
    AsyncEdge7815 findByName(String name);
}
