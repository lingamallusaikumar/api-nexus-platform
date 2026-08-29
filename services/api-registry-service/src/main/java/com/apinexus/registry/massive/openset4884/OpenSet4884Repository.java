package com.apinexus.registry.massive.openset4884;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenSet4884Repository extends JpaRepository<OpenSet4884, Long> {
    OpenSet4884 findByName(String name);
}
