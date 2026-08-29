package com.apinexus.registry.massive.corestack2102;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreStack2102Repository extends JpaRepository<CoreStack2102, Long> {
    CoreStack2102 findByName(String name);
}
