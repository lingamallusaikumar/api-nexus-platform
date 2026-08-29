package com.apinexus.registry.massive.closedbuffer4684;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedBuffer4684Repository extends JpaRepository<ClosedBuffer4684, Long> {
    ClosedBuffer4684 findByName(String name);
}
