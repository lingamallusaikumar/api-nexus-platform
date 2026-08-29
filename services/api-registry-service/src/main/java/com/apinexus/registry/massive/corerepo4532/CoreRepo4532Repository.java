package com.apinexus.registry.massive.corerepo4532;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreRepo4532Repository extends JpaRepository<CoreRepo4532, Long> {
    CoreRepo4532 findByName(String name);
}
