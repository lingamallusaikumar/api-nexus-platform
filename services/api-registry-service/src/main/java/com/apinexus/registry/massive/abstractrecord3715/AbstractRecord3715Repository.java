package com.apinexus.registry.massive.abstractrecord3715;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractRecord3715Repository extends JpaRepository<AbstractRecord3715, Long> {
    AbstractRecord3715 findByName(String name);
}
