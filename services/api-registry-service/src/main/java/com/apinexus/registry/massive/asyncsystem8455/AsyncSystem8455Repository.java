package com.apinexus.registry.massive.asyncsystem8455;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncSystem8455Repository extends JpaRepository<AsyncSystem8455, Long> {
    AsyncSystem8455 findByName(String name);
}
