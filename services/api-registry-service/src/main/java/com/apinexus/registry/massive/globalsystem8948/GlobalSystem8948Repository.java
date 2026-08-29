package com.apinexus.registry.massive.globalsystem8948;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalSystem8948Repository extends JpaRepository<GlobalSystem8948, Long> {
    GlobalSystem8948 findByName(String name);
}
