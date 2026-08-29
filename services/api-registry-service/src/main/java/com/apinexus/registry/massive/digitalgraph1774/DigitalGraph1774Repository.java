package com.apinexus.registry.massive.digitalgraph1774;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalGraph1774Repository extends JpaRepository<DigitalGraph1774, Long> {
    DigitalGraph1774 findByName(String name);
}
