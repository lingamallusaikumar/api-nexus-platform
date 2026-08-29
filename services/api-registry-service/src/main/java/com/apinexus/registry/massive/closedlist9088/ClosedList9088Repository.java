package com.apinexus.registry.massive.closedlist9088;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedList9088Repository extends JpaRepository<ClosedList9088, Long> {
    ClosedList9088 findByName(String name);
}
