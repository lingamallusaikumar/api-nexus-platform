package com.apinexus.registry.massive.datastore6665;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataStore6665Repository extends JpaRepository<DataStore6665, Long> {
    DataStore6665 findByName(String name);
}
