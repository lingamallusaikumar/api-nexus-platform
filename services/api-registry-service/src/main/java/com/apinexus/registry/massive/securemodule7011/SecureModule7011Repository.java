package com.apinexus.registry.massive.securemodule7011;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureModule7011Repository extends JpaRepository<SecureModule7011, Long> {
    SecureModule7011 findByName(String name);
}
