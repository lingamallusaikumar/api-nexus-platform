package com.apinexus.registry.massive.corepath8374;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorePath8374Repository extends JpaRepository<CorePath8374, Long> {
    CorePath8374 findByName(String name);
}
