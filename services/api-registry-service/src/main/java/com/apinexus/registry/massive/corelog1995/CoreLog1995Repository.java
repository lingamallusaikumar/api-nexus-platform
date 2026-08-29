package com.apinexus.registry.massive.corelog1995;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreLog1995Repository extends JpaRepository<CoreLog1995, Long> {
    CoreLog1995 findByName(String name);
}
