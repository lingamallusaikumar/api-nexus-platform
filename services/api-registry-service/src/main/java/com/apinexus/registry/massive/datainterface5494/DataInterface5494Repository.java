package com.apinexus.registry.massive.datainterface5494;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataInterface5494Repository extends JpaRepository<DataInterface5494, Long> {
    DataInterface5494 findByName(String name);
}
