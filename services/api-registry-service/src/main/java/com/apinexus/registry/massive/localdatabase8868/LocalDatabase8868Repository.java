package com.apinexus.registry.massive.localdatabase8868;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalDatabase8868Repository extends JpaRepository<LocalDatabase8868, Long> {
    LocalDatabase8868 findByName(String name);
}
