package com.apinexus.registry.massive.abstractflow4516;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractFlow4516Repository extends JpaRepository<AbstractFlow4516, Long> {
    AbstractFlow4516 findByName(String name);
}
