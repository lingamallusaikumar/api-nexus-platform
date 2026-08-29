package com.apinexus.registry.massive.localvertex5005;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalVertex5005Repository extends JpaRepository<LocalVertex5005, Long> {
    LocalVertex5005 findByName(String name);
}
