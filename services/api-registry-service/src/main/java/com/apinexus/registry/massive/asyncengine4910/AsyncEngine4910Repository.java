package com.apinexus.registry.massive.asyncengine4910;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncEngine4910Repository extends JpaRepository<AsyncEngine4910, Long> {
    AsyncEngine4910 findByName(String name);
}
