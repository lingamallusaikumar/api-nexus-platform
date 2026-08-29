package com.apinexus.registry.massive.remoteedge6725;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteEdge6725Repository extends JpaRepository<RemoteEdge6725, Long> {
    RemoteEdge6725 findByName(String name);
}
