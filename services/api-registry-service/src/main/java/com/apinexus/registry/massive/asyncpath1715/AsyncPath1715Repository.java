package com.apinexus.registry.massive.asyncpath1715;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncPath1715Repository extends JpaRepository<AsyncPath1715, Long> {
    AsyncPath1715 findByName(String name);
}
