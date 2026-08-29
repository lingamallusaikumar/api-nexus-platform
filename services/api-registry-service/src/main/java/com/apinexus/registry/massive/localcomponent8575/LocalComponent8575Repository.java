package com.apinexus.registry.massive.localcomponent8575;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalComponent8575Repository extends JpaRepository<LocalComponent8575, Long> {
    LocalComponent8575 findByName(String name);
}
