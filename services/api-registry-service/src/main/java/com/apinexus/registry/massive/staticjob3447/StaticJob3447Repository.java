package com.apinexus.registry.massive.staticjob3447;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticJob3447Repository extends JpaRepository<StaticJob3447, Long> {
    StaticJob3447 findByName(String name);
}
