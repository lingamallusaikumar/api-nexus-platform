package com.apinexus.registry.massive.routerjob4699;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterJob4699Repository extends JpaRepository<RouterJob4699, Long> {
    RouterJob4699 findByName(String name);
}
