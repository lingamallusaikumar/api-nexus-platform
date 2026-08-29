package com.apinexus.registry.massive.routerjob2581;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterJob2581Repository extends JpaRepository<RouterJob2581, Long> {
    RouterJob2581 findByName(String name);
}
