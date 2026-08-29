package com.apinexus.registry.massive.routeradapter276;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterAdapter276Repository extends JpaRepository<RouterAdapter276, Long> {
    RouterAdapter276 findByName(String name);
}
