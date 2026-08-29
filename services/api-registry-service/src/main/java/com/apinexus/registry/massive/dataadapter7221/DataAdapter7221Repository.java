package com.apinexus.registry.massive.dataadapter7221;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataAdapter7221Repository extends JpaRepository<DataAdapter7221, Long> {
    DataAdapter7221 findByName(String name);
}
