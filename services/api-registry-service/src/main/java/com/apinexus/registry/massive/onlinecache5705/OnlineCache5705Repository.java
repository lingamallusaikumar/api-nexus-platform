package com.apinexus.registry.massive.onlinecache5705;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineCache5705Repository extends JpaRepository<OnlineCache5705, Long> {
    OnlineCache5705 findByName(String name);
}
