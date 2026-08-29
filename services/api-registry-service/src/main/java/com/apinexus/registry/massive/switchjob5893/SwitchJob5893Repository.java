package com.apinexus.registry.massive.switchjob5893;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchJob5893Repository extends JpaRepository<SwitchJob5893, Long> {
    SwitchJob5893 findByName(String name);
}
