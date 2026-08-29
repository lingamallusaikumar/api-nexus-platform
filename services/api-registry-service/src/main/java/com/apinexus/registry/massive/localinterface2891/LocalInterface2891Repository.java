package com.apinexus.registry.massive.localinterface2891;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalInterface2891Repository extends JpaRepository<LocalInterface2891, Long> {
    LocalInterface2891 findByName(String name);
}
