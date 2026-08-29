package com.apinexus.registry.massive.staticlink3989;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticLink3989Repository extends JpaRepository<StaticLink3989, Long> {
    StaticLink3989 findByName(String name);
}
