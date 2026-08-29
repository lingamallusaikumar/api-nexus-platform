package com.apinexus.registry.massive.opencomponent4242;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenComponent4242Repository extends JpaRepository<OpenComponent4242, Long> {
    OpenComponent4242 findByName(String name);
}
