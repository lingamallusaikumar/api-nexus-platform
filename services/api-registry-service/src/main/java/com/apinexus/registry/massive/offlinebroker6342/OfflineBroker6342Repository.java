package com.apinexus.registry.massive.offlinebroker6342;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineBroker6342Repository extends JpaRepository<OfflineBroker6342, Long> {
    OfflineBroker6342 findByName(String name);
}
