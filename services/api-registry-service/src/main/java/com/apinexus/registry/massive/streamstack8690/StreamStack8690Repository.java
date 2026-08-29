package com.apinexus.registry.massive.streamstack8690;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamStack8690Repository extends JpaRepository<StreamStack8690, Long> {
    StreamStack8690 findByName(String name);
}
