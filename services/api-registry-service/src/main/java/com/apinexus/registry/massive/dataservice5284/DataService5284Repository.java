package com.apinexus.registry.massive.dataservice5284;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataService5284Repository extends JpaRepository<DataService5284, Long> {
    DataService5284 findByName(String name);
}
