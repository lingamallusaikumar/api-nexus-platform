package com.apinexus.registry.massive.chainworker4780;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainWorker4780Repository extends JpaRepository<ChainWorker4780, Long> {
    ChainWorker4780 findByName(String name);
}
