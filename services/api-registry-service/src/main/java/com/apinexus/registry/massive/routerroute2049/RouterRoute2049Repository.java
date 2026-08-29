package com.apinexus.registry.massive.routerroute2049;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterRoute2049Repository extends JpaRepository<RouterRoute2049, Long> {
    RouterRoute2049 findByName(String name);
}
