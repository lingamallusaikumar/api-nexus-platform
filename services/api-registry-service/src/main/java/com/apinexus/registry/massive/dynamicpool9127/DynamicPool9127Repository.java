package com.apinexus.registry.massive.dynamicpool9127;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicPool9127Repository extends JpaRepository<DynamicPool9127, Long> {
    DynamicPool9127 findByName(String name);
}
