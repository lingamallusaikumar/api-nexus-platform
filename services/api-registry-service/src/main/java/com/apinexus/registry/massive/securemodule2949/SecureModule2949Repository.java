package com.apinexus.registry.massive.securemodule2949;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureModule2949Repository extends JpaRepository<SecureModule2949, Long> {
    SecureModule2949 findByName(String name);
}
