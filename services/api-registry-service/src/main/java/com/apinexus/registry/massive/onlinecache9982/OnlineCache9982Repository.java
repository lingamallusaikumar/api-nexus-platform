package com.apinexus.registry.massive.onlinecache9982;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineCache9982Repository extends JpaRepository<OnlineCache9982, Long> {
    OnlineCache9982 findByName(String name);
}
