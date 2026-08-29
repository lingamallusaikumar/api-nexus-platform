package com.apinexus.registry.massive.staticrepo9688;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticRepo9688Repository extends JpaRepository<StaticRepo9688, Long> {
    StaticRepo9688 findByName(String name);
}
