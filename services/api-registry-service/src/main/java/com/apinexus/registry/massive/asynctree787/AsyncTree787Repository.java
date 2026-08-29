package com.apinexus.registry.massive.asynctree787;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncTree787Repository extends JpaRepository<AsyncTree787, Long> {
    AsyncTree787 findByName(String name);
}
