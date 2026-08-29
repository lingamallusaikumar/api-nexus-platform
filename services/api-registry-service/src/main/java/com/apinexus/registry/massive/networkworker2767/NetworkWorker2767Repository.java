package com.apinexus.registry.massive.networkworker2767;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkWorker2767Repository extends JpaRepository<NetworkWorker2767, Long> {
    NetworkWorker2767 findByName(String name);
}
