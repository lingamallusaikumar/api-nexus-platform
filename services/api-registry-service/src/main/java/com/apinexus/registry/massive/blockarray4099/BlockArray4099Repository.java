package com.apinexus.registry.massive.blockarray4099;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockArray4099Repository extends JpaRepository<BlockArray4099, Long> {
    BlockArray4099 findByName(String name);
}
