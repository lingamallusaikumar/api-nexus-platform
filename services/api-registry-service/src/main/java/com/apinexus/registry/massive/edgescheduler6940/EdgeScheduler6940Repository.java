package com.apinexus.registry.massive.edgescheduler6940;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeScheduler6940Repository extends JpaRepository<EdgeScheduler6940, Long> {
    EdgeScheduler6940 findByName(String name);
}
