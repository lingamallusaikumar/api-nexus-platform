package com.apinexus.registry.massive.staticroute7423;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticRoute7423Repository extends JpaRepository<StaticRoute7423, Long> {
    StaticRoute7423 findByName(String name);
}
