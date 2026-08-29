package com.apinexus.registry.massive.localset2663;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalSet2663Repository extends JpaRepository<LocalSet2663, Long> {
    LocalSet2663 findByName(String name);
}
