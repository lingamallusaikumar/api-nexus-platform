package com.apinexus.registry.massive.dynamicnode2440;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicNode2440Repository extends JpaRepository<DynamicNode2440, Long> {
    DynamicNode2440 findByName(String name);
}
