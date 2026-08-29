package com.apinexus.registry.massive.edgeadapter7477;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeAdapter7477Repository extends JpaRepository<EdgeAdapter7477, Long> {
    EdgeAdapter7477 findByName(String name);
}
