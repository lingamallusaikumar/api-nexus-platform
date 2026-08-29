package com.apinexus.registry.massive.openbridge6025;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenBridge6025Repository extends JpaRepository<OpenBridge6025, Long> {
    OpenBridge6025 findByName(String name);
}
