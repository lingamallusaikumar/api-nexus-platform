package com.apinexus.registry.massive.openpool7932;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenPool7932Repository extends JpaRepository<OpenPool7932, Long> {
    OpenPool7932 findByName(String name);
}
