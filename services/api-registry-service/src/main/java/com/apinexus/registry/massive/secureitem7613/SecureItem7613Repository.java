package com.apinexus.registry.massive.secureitem7613;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureItem7613Repository extends JpaRepository<SecureItem7613, Long> {
    SecureItem7613 findByName(String name);
}
