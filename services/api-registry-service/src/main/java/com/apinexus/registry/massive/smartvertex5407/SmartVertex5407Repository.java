package com.apinexus.registry.massive.smartvertex5407;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartVertex5407Repository extends JpaRepository<SmartVertex5407, Long> {
    SmartVertex5407 findByName(String name);
}
