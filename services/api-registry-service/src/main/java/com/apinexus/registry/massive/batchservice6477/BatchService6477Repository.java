package com.apinexus.registry.massive.batchservice6477;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchService6477Repository extends JpaRepository<BatchService6477, Long> {
    BatchService6477 findByName(String name);
}
