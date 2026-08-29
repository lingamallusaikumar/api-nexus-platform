package com.apinexus.registry.massive.localstore1134;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalStore1134Repository extends JpaRepository<LocalStore1134, Long> {
    LocalStore1134 findByName(String name);
}
