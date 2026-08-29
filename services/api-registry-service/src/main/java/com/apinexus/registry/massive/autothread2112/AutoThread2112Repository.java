package com.apinexus.registry.massive.autothread2112;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoThread2112Repository extends JpaRepository<AutoThread2112, Long> {
    AutoThread2112 findByName(String name);
}
