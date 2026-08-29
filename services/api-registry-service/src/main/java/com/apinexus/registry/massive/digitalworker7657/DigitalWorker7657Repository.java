package com.apinexus.registry.massive.digitalworker7657;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalWorker7657Repository extends JpaRepository<DigitalWorker7657, Long> {
    DigitalWorker7657 findByName(String name);
}
