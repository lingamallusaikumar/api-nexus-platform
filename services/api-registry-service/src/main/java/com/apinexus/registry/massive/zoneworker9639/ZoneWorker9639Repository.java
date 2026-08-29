package com.apinexus.registry.massive.zoneworker9639;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneWorker9639Repository extends JpaRepository<ZoneWorker9639, Long> {
    ZoneWorker9639 findByName(String name);
}
