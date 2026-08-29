package com.apinexus.registry.massive.smartstack7701;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartStack7701Repository extends JpaRepository<SmartStack7701, Long> {
    SmartStack7701 findByName(String name);
}
