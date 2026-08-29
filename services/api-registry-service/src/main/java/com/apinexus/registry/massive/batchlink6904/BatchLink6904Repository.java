package com.apinexus.registry.massive.batchlink6904;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchLink6904Repository extends JpaRepository<BatchLink6904, Long> {
    BatchLink6904 findByName(String name);
}
