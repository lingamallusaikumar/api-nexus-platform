package com.apinexus.registry.massive.openarray806;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenArray806Repository extends JpaRepository<OpenArray806, Long> {
    OpenArray806 findByName(String name);
}
