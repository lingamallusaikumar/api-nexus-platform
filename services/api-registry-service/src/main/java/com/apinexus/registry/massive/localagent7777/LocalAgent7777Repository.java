package com.apinexus.registry.massive.localagent7777;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalAgent7777Repository extends JpaRepository<LocalAgent7777, Long> {
    LocalAgent7777 findByName(String name);
}
