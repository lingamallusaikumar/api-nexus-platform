package com.apinexus.registry.massive.onlinequeue6496;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineQueue6496Repository extends JpaRepository<OnlineQueue6496, Long> {
    OnlineQueue6496 findByName(String name);
}
