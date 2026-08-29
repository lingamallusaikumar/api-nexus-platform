package com.apinexus.registry.massive.blockrepo9471;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepo9471Repository extends JpaRepository<BlockRepo9471, Long> {
    BlockRepo9471 findByName(String name);
}
