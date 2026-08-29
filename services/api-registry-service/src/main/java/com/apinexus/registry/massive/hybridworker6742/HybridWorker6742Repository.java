package com.apinexus.registry.massive.hybridworker6742;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridWorker6742Repository extends JpaRepository<HybridWorker6742, Long> {
    HybridWorker6742 findByName(String name);
}
