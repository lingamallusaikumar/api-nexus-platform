package com.apinexus.registry.massive.closedbroker592;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedBroker592Repository extends JpaRepository<ClosedBroker592, Long> {
    ClosedBroker592 findByName(String name);
}
