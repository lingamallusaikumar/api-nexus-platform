package com.apinexus.registry.massive.staticgraph923;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticGraph923Repository extends JpaRepository<StaticGraph923, Long> {
    StaticGraph923 findByName(String name);
}
