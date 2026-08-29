package com.apinexus.registry.massive.staticengine1746;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticEngine1746Repository extends JpaRepository<StaticEngine1746, Long> {
    StaticEngine1746 findByName(String name);
}
