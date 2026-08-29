package com.apinexus.registry.massive.datasystem8311;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSystem8311Repository extends JpaRepository<DataSystem8311, Long> {
    DataSystem8311 findByName(String name);
}
