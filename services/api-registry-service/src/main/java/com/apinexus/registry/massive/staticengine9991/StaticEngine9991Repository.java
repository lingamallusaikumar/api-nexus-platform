package com.apinexus.registry.massive.staticengine9991;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticEngine9991Repository extends JpaRepository<StaticEngine9991, Long> {
    StaticEngine9991 findByName(String name);
}
