package com.apinexus.registry.massive.secureprocess8850;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureProcess8850Repository extends JpaRepository<SecureProcess8850, Long> {
    SecureProcess8850 findByName(String name);
}
