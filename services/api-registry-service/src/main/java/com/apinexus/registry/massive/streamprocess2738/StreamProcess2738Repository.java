package com.apinexus.registry.massive.streamprocess2738;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamProcess2738Repository extends JpaRepository<StreamProcess2738, Long> {
    StreamProcess2738 findByName(String name);
}
