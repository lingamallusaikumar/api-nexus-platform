package com.apinexus.registry.massive.autolink5524;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoLink5524Repository extends JpaRepository<AutoLink5524, Long> {
    AutoLink5524 findByName(String name);
}
