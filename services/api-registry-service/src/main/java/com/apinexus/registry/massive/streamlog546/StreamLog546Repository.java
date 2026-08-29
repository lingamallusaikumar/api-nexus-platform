package com.apinexus.registry.massive.streamlog546;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamLog546Repository extends JpaRepository<StreamLog546, Long> {
    StreamLog546 findByName(String name);
}
