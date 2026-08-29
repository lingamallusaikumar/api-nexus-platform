package com.apinexus.registry.massive.asyncflow5739;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncFlow5739Repository extends JpaRepository<AsyncFlow5739, Long> {
    AsyncFlow5739 findByName(String name);
}
