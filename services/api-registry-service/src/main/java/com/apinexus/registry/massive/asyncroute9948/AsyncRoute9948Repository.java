package com.apinexus.registry.massive.asyncroute9948;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncRoute9948Repository extends JpaRepository<AsyncRoute9948, Long> {
    AsyncRoute9948 findByName(String name);
}
