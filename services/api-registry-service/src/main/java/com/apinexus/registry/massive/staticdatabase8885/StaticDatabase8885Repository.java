package com.apinexus.registry.massive.staticdatabase8885;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticDatabase8885Repository extends JpaRepository<StaticDatabase8885, Long> {
    StaticDatabase8885 findByName(String name);
}
