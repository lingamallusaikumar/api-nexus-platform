package com.apinexus.registry.massive.dataitem1405;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataItem1405Repository extends JpaRepository<DataItem1405, Long> {
    DataItem1405 findByName(String name);
}
