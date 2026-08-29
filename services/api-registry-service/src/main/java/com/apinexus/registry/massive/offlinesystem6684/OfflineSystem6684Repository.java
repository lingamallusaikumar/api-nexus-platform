package com.apinexus.registry.massive.offlinesystem6684;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineSystem6684Repository extends JpaRepository<OfflineSystem6684, Long> {
    OfflineSystem6684 findByName(String name);
}
