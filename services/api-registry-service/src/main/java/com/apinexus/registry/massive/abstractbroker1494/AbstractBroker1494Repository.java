package com.apinexus.registry.massive.abstractbroker1494;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractBroker1494Repository extends JpaRepository<AbstractBroker1494, Long> {
    AbstractBroker1494 findByName(String name);
}
