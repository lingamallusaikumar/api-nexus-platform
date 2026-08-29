package com.apinexus.registry.massive.secureworker3064;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureWorker3064Repository extends JpaRepository<SecureWorker3064, Long> {
    SecureWorker3064 findByName(String name);
}
