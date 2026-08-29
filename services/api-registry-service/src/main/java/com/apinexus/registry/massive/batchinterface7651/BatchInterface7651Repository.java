package com.apinexus.registry.massive.batchinterface7651;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchInterface7651Repository extends JpaRepository<BatchInterface7651, Long> {
    BatchInterface7651 findByName(String name);
}
