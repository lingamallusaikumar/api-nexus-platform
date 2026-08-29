package com.apinexus.registry.massive.digitalscheduler4736;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalScheduler4736Repository extends JpaRepository<DigitalScheduler4736, Long> {
    DigitalScheduler4736 findByName(String name);
}
