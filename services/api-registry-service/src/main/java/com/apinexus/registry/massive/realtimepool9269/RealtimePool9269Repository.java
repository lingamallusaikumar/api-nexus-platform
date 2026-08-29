package com.apinexus.registry.massive.realtimepool9269;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimePool9269Repository extends JpaRepository<RealtimePool9269, Long> {
    RealtimePool9269 findByName(String name);
}
