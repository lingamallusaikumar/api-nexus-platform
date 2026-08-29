package com.apinexus.registry.massive.abstractstore791;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractStore791Repository extends JpaRepository<AbstractStore791, Long> {
    AbstractStore791 findByName(String name);
}
