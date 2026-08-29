package com.apinexus.registry.massive.abstractbuffer3734;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractBuffer3734Repository extends JpaRepository<AbstractBuffer3734, Long> {
    AbstractBuffer3734 findByName(String name);
}
