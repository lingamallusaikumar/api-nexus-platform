package com.apinexus.registry.massive.streamstore4050;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamStore4050Repository extends JpaRepository<StreamStore4050, Long> {
    StreamStore4050 findByName(String name);
}
