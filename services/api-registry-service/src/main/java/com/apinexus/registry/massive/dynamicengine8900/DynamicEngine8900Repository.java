package com.apinexus.registry.massive.dynamicengine8900;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicEngine8900Repository extends JpaRepository<DynamicEngine8900, Long> {
    DynamicEngine8900 findByName(String name);
}
