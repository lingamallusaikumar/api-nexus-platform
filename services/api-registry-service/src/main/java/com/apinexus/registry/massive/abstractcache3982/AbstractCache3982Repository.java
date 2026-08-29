package com.apinexus.registry.massive.abstractcache3982;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractCache3982Repository extends JpaRepository<AbstractCache3982, Long> {
    AbstractCache3982 findByName(String name);
}
