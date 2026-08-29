package com.apinexus.registry.massive.localflow7864;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalFlow7864Repository extends JpaRepository<LocalFlow7864, Long> {
    LocalFlow7864 findByName(String name);
}
