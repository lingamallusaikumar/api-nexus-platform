package com.apinexus.registry.massive.abstractpool1059;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractPool1059Repository extends JpaRepository<AbstractPool1059, Long> {
    AbstractPool1059 findByName(String name);
}
