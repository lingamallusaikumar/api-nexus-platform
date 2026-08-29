package com.apinexus.registry.massive.networkscheduler7666;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkScheduler7666Repository extends JpaRepository<NetworkScheduler7666, Long> {
    NetworkScheduler7666 findByName(String name);
}
