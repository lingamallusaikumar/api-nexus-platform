package com.apinexus.registry.massive.edgehandler1868;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeHandler1868Repository extends JpaRepository<EdgeHandler1868, Long> {
    EdgeHandler1868 findByName(String name);
}
