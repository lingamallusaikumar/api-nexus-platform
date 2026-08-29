package com.apinexus.registry.massive.localagent4593;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalAgent4593Repository extends JpaRepository<LocalAgent4593, Long> {
    LocalAgent4593 findByName(String name);
}
