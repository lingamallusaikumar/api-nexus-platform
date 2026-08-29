package com.apinexus.registry.features.ratelimitwindow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateLimitWindowRepository extends JpaRepository<RateLimitWindow, Long> {
    RateLimitWindow findByName(String name);
}
