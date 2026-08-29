package com.apinexus.registry.massive.autotask3414;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoTask3414Repository extends JpaRepository<AutoTask3414, Long> {
    AutoTask3414 findByName(String name);
}
