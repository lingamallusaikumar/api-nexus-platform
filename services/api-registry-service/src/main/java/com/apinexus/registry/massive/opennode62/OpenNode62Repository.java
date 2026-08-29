package com.apinexus.registry.massive.opennode62;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenNode62Repository extends JpaRepository<OpenNode62, Long> {
    OpenNode62 findByName(String name);
}
