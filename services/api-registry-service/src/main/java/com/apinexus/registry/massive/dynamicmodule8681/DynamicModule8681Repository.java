package com.apinexus.registry.massive.dynamicmodule8681;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicModule8681Repository extends JpaRepository<DynamicModule8681, Long> {
    DynamicModule8681 findByName(String name);
}
