package com.apinexus.registry.massive.blockarray1040;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockArray1040Repository extends JpaRepository<BlockArray1040, Long> {
    BlockArray1040 findByName(String name);
}
