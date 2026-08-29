package com.apinexus.registry.massive.streamentry1670;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamEntry1670Repository extends JpaRepository<StreamEntry1670, Long> {
    StreamEntry1670 findByName(String name);
}
