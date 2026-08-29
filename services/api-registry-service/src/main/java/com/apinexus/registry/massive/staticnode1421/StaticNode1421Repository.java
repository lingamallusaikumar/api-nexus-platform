package com.apinexus.registry.massive.staticnode1421;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticNode1421Repository extends JpaRepository<StaticNode1421, Long> {
    StaticNode1421 findByName(String name);
}
