package com.apinexus.registry.massive.offlinedispatcher2585;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineDispatcher2585Repository extends JpaRepository<OfflineDispatcher2585, Long> {
    OfflineDispatcher2585 findByName(String name);
}
