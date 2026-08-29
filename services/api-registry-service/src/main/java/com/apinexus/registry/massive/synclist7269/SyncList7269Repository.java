package com.apinexus.registry.massive.synclist7269;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncList7269Repository extends JpaRepository<SyncList7269, Long> {
    SyncList7269 findByName(String name);
}
