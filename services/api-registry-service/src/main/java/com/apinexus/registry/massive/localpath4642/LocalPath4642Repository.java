package com.apinexus.registry.massive.localpath4642;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalPath4642Repository extends JpaRepository<LocalPath4642, Long> {
    LocalPath4642 findByName(String name);
}
