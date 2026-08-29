package com.apinexus.registry.massive.staticmodule383;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticModule383Repository extends JpaRepository<StaticModule383, Long> {
    StaticModule383 findByName(String name);
}
