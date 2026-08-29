package com.apinexus.registry.massive.streamarray8782;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamArray8782Repository extends JpaRepository<StreamArray8782, Long> {
    StreamArray8782 findByName(String name);
}
