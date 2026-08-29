package com.apinexus.registry.massive.offlinetask7431;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineTask7431Repository extends JpaRepository<OfflineTask7431, Long> {
    OfflineTask7431 findByName(String name);
}
