package com.apinexus.registry.massive.abstractadapter6939;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractAdapter6939Repository extends JpaRepository<AbstractAdapter6939, Long> {
    AbstractAdapter6939 findByName(String name);
}
