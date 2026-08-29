package com.apinexus.registry.massive.chainscheduler1338;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainScheduler1338Repository extends JpaRepository<ChainScheduler1338, Long> {
    ChainScheduler1338 findByName(String name);
}
