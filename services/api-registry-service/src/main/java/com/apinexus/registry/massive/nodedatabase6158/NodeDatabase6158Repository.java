package com.apinexus.registry.massive.nodedatabase6158;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeDatabase6158Repository extends JpaRepository<NodeDatabase6158, Long> {
    NodeDatabase6158 findByName(String name);
}
