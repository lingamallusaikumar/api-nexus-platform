package com.apinexus.registry.massive.edgescheduler9491;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeScheduler9491Repository extends JpaRepository<EdgeScheduler9491, Long> {
    EdgeScheduler9491 findByName(String name);
}
