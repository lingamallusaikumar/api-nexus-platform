package com.apinexus.registry.massive.localset5161;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalSet5161Repository extends JpaRepository<LocalSet5161, Long> {
    LocalSet5161 findByName(String name);
}
