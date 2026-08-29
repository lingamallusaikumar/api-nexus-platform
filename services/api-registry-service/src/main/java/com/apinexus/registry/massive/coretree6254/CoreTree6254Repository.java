package com.apinexus.registry.massive.coretree6254;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreTree6254Repository extends JpaRepository<CoreTree6254, Long> {
    CoreTree6254 findByName(String name);
}
