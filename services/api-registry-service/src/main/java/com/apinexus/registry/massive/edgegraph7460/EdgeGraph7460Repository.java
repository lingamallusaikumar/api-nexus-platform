package com.apinexus.registry.massive.edgegraph7460;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeGraph7460Repository extends JpaRepository<EdgeGraph7460, Long> {
    EdgeGraph7460 findByName(String name);
}
