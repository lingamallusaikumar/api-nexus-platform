package com.apinexus.registry.massive.staticadapter9637;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticAdapter9637Repository extends JpaRepository<StaticAdapter9637, Long> {
    StaticAdapter9637 findByName(String name);
}
