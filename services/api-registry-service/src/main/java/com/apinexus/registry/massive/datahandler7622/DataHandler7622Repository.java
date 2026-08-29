package com.apinexus.registry.massive.datahandler7622;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataHandler7622Repository extends JpaRepository<DataHandler7622, Long> {
    DataHandler7622 findByName(String name);
}
