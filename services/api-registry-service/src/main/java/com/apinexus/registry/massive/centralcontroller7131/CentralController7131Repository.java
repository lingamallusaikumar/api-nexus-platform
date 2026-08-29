package com.apinexus.registry.massive.centralcontroller7131;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralController7131Repository extends JpaRepository<CentralController7131, Long> {
    CentralController7131 findByName(String name);
}
