package com.apinexus.registry.massive.securecache6285;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureCache6285Repository extends JpaRepository<SecureCache6285, Long> {
    SecureCache6285 findByName(String name);
}
