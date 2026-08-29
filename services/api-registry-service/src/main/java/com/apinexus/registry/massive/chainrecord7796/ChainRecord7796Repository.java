package com.apinexus.registry.massive.chainrecord7796;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainRecord7796Repository extends JpaRepository<ChainRecord7796, Long> {
    ChainRecord7796 findByName(String name);
}
