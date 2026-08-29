package com.apinexus.registry.massive.datasystem1865;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSystem1865Repository extends JpaRepository<DataSystem1865, Long> {
    DataSystem1865 findByName(String name);
}
