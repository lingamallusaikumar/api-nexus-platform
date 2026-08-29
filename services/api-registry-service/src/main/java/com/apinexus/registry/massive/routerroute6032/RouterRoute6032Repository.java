package com.apinexus.registry.massive.routerroute6032;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterRoute6032Repository extends JpaRepository<RouterRoute6032, Long> {
    RouterRoute6032 findByName(String name);
}
