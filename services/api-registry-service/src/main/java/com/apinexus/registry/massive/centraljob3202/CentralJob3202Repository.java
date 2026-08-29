package com.apinexus.registry.massive.centraljob3202;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralJob3202Repository extends JpaRepository<CentralJob3202, Long> {
    CentralJob3202 findByName(String name);
}
