package com.apinexus.registry.massive.networkscheduler934;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkScheduler934Repository extends JpaRepository<NetworkScheduler934, Long> {
    NetworkScheduler934 findByName(String name);
}
