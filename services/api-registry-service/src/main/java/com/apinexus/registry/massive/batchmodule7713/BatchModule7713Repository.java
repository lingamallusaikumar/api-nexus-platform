package com.apinexus.registry.massive.batchmodule7713;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchModule7713Repository extends JpaRepository<BatchModule7713, Long> {
    BatchModule7713 findByName(String name);
}
