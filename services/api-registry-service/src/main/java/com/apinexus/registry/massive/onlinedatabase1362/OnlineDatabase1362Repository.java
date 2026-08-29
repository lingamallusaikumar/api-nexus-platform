package com.apinexus.registry.massive.onlinedatabase1362;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineDatabase1362Repository extends JpaRepository<OnlineDatabase1362, Long> {
    OnlineDatabase1362 findByName(String name);
}
