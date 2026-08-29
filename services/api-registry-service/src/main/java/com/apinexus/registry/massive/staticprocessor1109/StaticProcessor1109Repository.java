package com.apinexus.registry.massive.staticprocessor1109;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticProcessor1109Repository extends JpaRepository<StaticProcessor1109, Long> {
    StaticProcessor1109 findByName(String name);
}
