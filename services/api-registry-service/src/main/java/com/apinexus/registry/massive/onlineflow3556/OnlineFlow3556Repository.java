package com.apinexus.registry.massive.onlineflow3556;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineFlow3556Repository extends JpaRepository<OnlineFlow3556, Long> {
    OnlineFlow3556 findByName(String name);
}
