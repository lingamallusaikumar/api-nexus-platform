package com.apinexus.registry.massive.dynamicinterface1468;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicInterface1468Repository extends JpaRepository<DynamicInterface1468, Long> {
    DynamicInterface1468 findByName(String name);
}
