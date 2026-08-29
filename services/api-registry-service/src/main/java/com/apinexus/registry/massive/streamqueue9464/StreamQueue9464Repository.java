package com.apinexus.registry.massive.streamqueue9464;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamQueue9464Repository extends JpaRepository<StreamQueue9464, Long> {
    StreamQueue9464 findByName(String name);
}
