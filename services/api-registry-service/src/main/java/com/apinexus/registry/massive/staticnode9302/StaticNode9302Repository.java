package com.apinexus.registry.massive.staticnode9302;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticNode9302Repository extends JpaRepository<StaticNode9302, Long> {
    StaticNode9302 findByName(String name);
}
