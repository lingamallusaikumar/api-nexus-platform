package com.apinexus.registry.massive.closedengine3447;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedEngine3447Repository extends JpaRepository<ClosedEngine3447, Long> {
    ClosedEngine3447 findByName(String name);
}
