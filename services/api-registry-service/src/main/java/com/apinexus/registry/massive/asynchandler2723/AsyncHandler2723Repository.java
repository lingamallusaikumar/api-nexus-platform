package com.apinexus.registry.massive.asynchandler2723;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncHandler2723Repository extends JpaRepository<AsyncHandler2723, Long> {
    AsyncHandler2723 findByName(String name);
}
