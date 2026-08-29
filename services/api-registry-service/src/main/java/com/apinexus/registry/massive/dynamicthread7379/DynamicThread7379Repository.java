package com.apinexus.registry.massive.dynamicthread7379;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicThread7379Repository extends JpaRepository<DynamicThread7379, Long> {
    DynamicThread7379 findByName(String name);
}
