package com.apinexus.registry.massive.abstractpath7370;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractPath7370Repository extends JpaRepository<AbstractPath7370, Long> {
    AbstractPath7370 findByName(String name);
}
