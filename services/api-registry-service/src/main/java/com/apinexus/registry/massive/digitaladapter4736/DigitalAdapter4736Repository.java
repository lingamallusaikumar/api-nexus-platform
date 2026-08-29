package com.apinexus.registry.massive.digitaladapter4736;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalAdapter4736Repository extends JpaRepository<DigitalAdapter4736, Long> {
    DigitalAdapter4736 findByName(String name);
}
