package com.apinexus.registry.massive.autonode115;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoNode115Repository extends JpaRepository<AutoNode115, Long> {
    AutoNode115 findByName(String name);
}
