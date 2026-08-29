package com.apinexus.registry.massive.centralbuffer8902;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralBuffer8902Repository extends JpaRepository<CentralBuffer8902, Long> {
    CentralBuffer8902 findByName(String name);
}
