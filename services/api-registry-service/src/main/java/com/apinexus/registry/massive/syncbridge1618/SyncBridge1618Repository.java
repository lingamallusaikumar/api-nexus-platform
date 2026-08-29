package com.apinexus.registry.massive.syncbridge1618;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncBridge1618Repository extends JpaRepository<SyncBridge1618, Long> {
    SyncBridge1618 findByName(String name);
}
