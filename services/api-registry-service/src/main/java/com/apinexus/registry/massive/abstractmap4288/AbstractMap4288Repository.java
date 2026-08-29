package com.apinexus.registry.massive.abstractmap4288;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractMap4288Repository extends JpaRepository<AbstractMap4288, Long> {
    AbstractMap4288 findByName(String name);
}
