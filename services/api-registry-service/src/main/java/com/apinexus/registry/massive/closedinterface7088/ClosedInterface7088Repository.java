package com.apinexus.registry.massive.closedinterface7088;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedInterface7088Repository extends JpaRepository<ClosedInterface7088, Long> {
    ClosedInterface7088 findByName(String name);
}
