package com.apinexus.registry.massive.switchmap9217;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchMap9217Repository extends JpaRepository<SwitchMap9217, Long> {
    SwitchMap9217 findByName(String name);
}
