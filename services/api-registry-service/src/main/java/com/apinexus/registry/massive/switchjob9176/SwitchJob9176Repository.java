package com.apinexus.registry.massive.switchjob9176;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchJob9176Repository extends JpaRepository<SwitchJob9176, Long> {
    SwitchJob9176 findByName(String name);
}
