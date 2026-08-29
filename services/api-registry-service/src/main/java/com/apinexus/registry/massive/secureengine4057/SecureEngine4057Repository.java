package com.apinexus.registry.massive.secureengine4057;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureEngine4057Repository extends JpaRepository<SecureEngine4057, Long> {
    SecureEngine4057 findByName(String name);
}
