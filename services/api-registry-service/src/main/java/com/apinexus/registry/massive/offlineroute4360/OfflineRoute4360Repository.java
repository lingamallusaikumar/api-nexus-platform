package com.apinexus.registry.massive.offlineroute4360;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineRoute4360Repository extends JpaRepository<OfflineRoute4360, Long> {
    OfflineRoute4360 findByName(String name);
}
