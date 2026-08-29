package com.apinexus.registry.massive.chainlist8983;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainList8983Repository extends JpaRepository<ChainList8983, Long> {
    ChainList8983 findByName(String name);
}
