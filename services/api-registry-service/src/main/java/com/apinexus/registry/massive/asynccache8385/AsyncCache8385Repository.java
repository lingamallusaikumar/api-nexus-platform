package com.apinexus.registry.massive.asynccache8385;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncCache8385Repository extends JpaRepository<AsyncCache8385, Long> {
    AsyncCache8385 findByName(String name);
}
