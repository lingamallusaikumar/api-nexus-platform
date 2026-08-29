package com.apinexus.registry.massive.localmodule3228;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalModule3228Repository extends JpaRepository<LocalModule3228, Long> {
    LocalModule3228 findByName(String name);
}
