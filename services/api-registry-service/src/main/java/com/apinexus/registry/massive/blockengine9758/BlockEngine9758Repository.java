package com.apinexus.registry.massive.blockengine9758;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockEngine9758Repository extends JpaRepository<BlockEngine9758, Long> {
    BlockEngine9758 findByName(String name);
}
