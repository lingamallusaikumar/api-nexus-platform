package com.apinexus.registry.massive.onlinecache1558;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineCache1558Repository extends JpaRepository<OnlineCache1558, Long> {
    OnlineCache1558 findByName(String name);
}
