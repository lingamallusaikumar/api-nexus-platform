package com.apinexus.registry.massive.closedthread4125;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedThread4125Repository extends JpaRepository<ClosedThread4125, Long> {
    ClosedThread4125 findByName(String name);
}
