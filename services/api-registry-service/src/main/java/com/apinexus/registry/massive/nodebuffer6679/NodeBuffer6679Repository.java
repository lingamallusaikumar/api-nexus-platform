package com.apinexus.registry.massive.nodebuffer6679;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeBuffer6679Repository extends JpaRepository<NodeBuffer6679, Long> {
    NodeBuffer6679 findByName(String name);
}
