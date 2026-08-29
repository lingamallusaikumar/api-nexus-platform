package com.apinexus.registry.massive.centralcomponent1077;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralComponent1077Repository extends JpaRepository<CentralComponent1077, Long> {
    CentralComponent1077 findByName(String name);
}
