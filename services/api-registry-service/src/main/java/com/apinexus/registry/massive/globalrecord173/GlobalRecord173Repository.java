package com.apinexus.registry.massive.globalrecord173;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalRecord173Repository extends JpaRepository<GlobalRecord173, Long> {
    GlobalRecord173 findByName(String name);
}
