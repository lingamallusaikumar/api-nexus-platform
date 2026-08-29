package com.apinexus.registry.massive.batchbuffer3327;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchBuffer3327Repository extends JpaRepository<BatchBuffer3327, Long> {
    BatchBuffer3327 findByName(String name);
}
