package com.apinexus.registry.massive.closedlist5670;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedList5670Repository extends JpaRepository<ClosedList5670, Long> {
    ClosedList5670 findByName(String name);
}
