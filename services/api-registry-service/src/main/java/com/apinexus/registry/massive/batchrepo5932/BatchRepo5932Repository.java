package com.apinexus.registry.massive.batchrepo5932;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepo5932Repository extends JpaRepository<BatchRepo5932, Long> {
    BatchRepo5932 findByName(String name);
}
