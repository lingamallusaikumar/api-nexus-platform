package com.apinexus.registry.massive.globalstore9299;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalStore9299Repository extends JpaRepository<GlobalStore9299, Long> {
    GlobalStore9299 findByName(String name);
}
