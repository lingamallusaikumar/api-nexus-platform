package com.apinexus.registry.massive.globaljob2748;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalJob2748Repository extends JpaRepository<GlobalJob2748, Long> {
    GlobalJob2748 findByName(String name);
}
