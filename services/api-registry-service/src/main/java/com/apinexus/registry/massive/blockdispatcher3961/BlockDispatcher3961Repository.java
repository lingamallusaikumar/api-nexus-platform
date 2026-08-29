package com.apinexus.registry.massive.blockdispatcher3961;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockDispatcher3961Repository extends JpaRepository<BlockDispatcher3961, Long> {
    BlockDispatcher3961 findByName(String name);
}
