package com.apinexus.registry.massive.asyncmodule7353;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncModule7353Repository extends JpaRepository<AsyncModule7353, Long> {
    AsyncModule7353 findByName(String name);
}
