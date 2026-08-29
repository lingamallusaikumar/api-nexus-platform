package com.apinexus.registry.massive.onlineinterface1146;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineInterface1146Repository extends JpaRepository<OnlineInterface1146, Long> {
    OnlineInterface1146 findByName(String name);
}
