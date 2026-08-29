package com.apinexus.registry.massive.offlineset1838;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineSet1838Repository extends JpaRepository<OfflineSet1838, Long> {
    OfflineSet1838 findByName(String name);
}
