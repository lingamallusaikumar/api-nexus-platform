package com.apinexus.registry.massive.staticrecord3948;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticRecord3948Repository extends JpaRepository<StaticRecord3948, Long> {
    StaticRecord3948 findByName(String name);
}
