package com.apinexus.registry.massive.asyncitem596;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncItem596Repository extends JpaRepository<AsyncItem596, Long> {
    AsyncItem596 findByName(String name);
}
