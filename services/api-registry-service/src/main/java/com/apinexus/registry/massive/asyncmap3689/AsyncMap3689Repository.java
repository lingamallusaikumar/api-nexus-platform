package com.apinexus.registry.massive.asyncmap3689;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncMap3689Repository extends JpaRepository<AsyncMap3689, Long> {
    AsyncMap3689 findByName(String name);
}
