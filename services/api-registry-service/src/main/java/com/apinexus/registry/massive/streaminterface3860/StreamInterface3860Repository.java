package com.apinexus.registry.massive.streaminterface3860;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamInterface3860Repository extends JpaRepository<StreamInterface3860, Long> {
    StreamInterface3860 findByName(String name);
}
