package com.apinexus.registry.massive.batchtask8470;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchTask8470Repository extends JpaRepository<BatchTask8470, Long> {
    BatchTask8470 findByName(String name);
}
