package com.apinexus.registry.massive.datatree8395;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataTree8395Repository extends JpaRepository<DataTree8395, Long> {
    DataTree8395 findByName(String name);
}
