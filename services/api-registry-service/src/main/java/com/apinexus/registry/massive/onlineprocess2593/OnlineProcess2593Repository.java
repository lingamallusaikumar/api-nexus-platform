package com.apinexus.registry.massive.onlineprocess2593;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineProcess2593Repository extends JpaRepository<OnlineProcess2593, Long> {
    OnlineProcess2593 findByName(String name);
}
