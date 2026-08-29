package com.apinexus.registry.massive.onlineitem8568;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineItem8568Repository extends JpaRepository<OnlineItem8568, Long> {
    OnlineItem8568 findByName(String name);
}
