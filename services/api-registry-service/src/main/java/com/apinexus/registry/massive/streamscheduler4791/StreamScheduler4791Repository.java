package com.apinexus.registry.massive.streamscheduler4791;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamScheduler4791Repository extends JpaRepository<StreamScheduler4791, Long> {
    StreamScheduler4791 findByName(String name);
}
