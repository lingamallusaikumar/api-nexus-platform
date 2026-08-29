package com.apinexus.registry.massive.abstractcontroller560;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractController560Repository extends JpaRepository<AbstractController560, Long> {
    AbstractController560 findByName(String name);
}
