package com.apinexus.registry.massive.asyncpool6787;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncPool6787Repository extends JpaRepository<AsyncPool6787, Long> {
    AsyncPool6787 findByName(String name);
}
