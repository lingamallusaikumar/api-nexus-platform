package com.apinexus.registry.massive.dynamicroute5289;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicRoute5289Repository extends JpaRepository<DynamicRoute5289, Long> {
    DynamicRoute5289 findByName(String name);
}
