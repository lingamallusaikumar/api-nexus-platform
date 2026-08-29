package com.apinexus.registry.massive.streamprocess8672;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamProcess8672Repository extends JpaRepository<StreamProcess8672, Long> {
    StreamProcess8672 findByName(String name);
}
