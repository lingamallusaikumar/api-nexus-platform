package com.apinexus.registry.massive.abstractagent956;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractAgent956Repository extends JpaRepository<AbstractAgent956, Long> {
    AbstractAgent956 findByName(String name);
}
