package com.apinexus.registry.massive.staticset2327;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticSet2327Repository extends JpaRepository<StaticSet2327, Long> {
    StaticSet2327 findByName(String name);
}
