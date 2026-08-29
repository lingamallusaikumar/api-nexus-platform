package com.apinexus.registry.massive.opendatabase4055;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenDatabase4055Repository extends JpaRepository<OpenDatabase4055, Long> {
    OpenDatabase4055 findByName(String name);
}
