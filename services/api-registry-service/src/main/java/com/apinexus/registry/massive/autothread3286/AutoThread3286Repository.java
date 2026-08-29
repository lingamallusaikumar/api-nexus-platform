package com.apinexus.registry.massive.autothread3286;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoThread3286Repository extends JpaRepository<AutoThread3286, Long> {
    AutoThread3286 findByName(String name);
}
