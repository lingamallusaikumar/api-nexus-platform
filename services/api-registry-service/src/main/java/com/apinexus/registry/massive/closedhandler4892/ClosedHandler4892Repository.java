package com.apinexus.registry.massive.closedhandler4892;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedHandler4892Repository extends JpaRepository<ClosedHandler4892, Long> {
    ClosedHandler4892 findByName(String name);
}
