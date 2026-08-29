package com.apinexus.registry.massive.chainengine3854;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainEngine3854Repository extends JpaRepository<ChainEngine3854, Long> {
    ChainEngine3854 findByName(String name);
}
