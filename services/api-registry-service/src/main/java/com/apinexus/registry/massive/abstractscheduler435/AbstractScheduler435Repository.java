package com.apinexus.registry.massive.abstractscheduler435;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractScheduler435Repository extends JpaRepository<AbstractScheduler435, Long> {
    AbstractScheduler435 findByName(String name);
}
