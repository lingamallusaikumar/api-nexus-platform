package com.apinexus.registry.massive.autostack1017;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoStack1017Repository extends JpaRepository<AutoStack1017, Long> {
    AutoStack1017 findByName(String name);
}
