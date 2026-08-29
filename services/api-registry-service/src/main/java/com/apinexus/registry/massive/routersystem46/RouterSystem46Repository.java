package com.apinexus.registry.massive.routersystem46;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterSystem46Repository extends JpaRepository<RouterSystem46, Long> {
    RouterSystem46 findByName(String name);
}
