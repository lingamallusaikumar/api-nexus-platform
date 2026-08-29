package com.apinexus.registry.massive.digitalscheduler6572;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalScheduler6572Repository extends JpaRepository<DigitalScheduler6572, Long> {
    DigitalScheduler6572 findByName(String name);
}
