package com.apinexus.registry.massive.networkworker9160;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkWorker9160Repository extends JpaRepository<NetworkWorker9160, Long> {
    NetworkWorker9160 findByName(String name);
}
