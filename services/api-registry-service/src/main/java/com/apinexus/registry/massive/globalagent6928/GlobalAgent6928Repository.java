package com.apinexus.registry.massive.globalagent6928;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalAgent6928Repository extends JpaRepository<GlobalAgent6928, Long> {
    GlobalAgent6928 findByName(String name);
}
