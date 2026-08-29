package com.apinexus.registry.massive.datarecord5975;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRecord5975Repository extends JpaRepository<DataRecord5975, Long> {
    DataRecord5975 findByName(String name);
}
