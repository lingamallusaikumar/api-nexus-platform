package com.apinexus.registry.massive.onlinearray8502;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineArray8502Repository extends JpaRepository<OnlineArray8502, Long> {
    OnlineArray8502 findByName(String name);
}
