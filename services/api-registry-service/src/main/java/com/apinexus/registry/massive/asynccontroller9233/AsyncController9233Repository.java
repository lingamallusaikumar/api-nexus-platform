package com.apinexus.registry.massive.asynccontroller9233;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncController9233Repository extends JpaRepository<AsyncController9233, Long> {
    AsyncController9233 findByName(String name);
}
