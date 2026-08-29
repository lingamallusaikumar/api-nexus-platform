package com.apinexus.registry.massive.virtualscheduler9796;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualScheduler9796Repository extends JpaRepository<VirtualScheduler9796, Long> {
    VirtualScheduler9796 findByName(String name);
}
