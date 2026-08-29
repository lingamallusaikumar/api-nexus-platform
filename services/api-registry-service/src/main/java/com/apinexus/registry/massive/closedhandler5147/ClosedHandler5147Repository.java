package com.apinexus.registry.massive.closedhandler5147;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedHandler5147Repository extends JpaRepository<ClosedHandler5147, Long> {
    ClosedHandler5147 findByName(String name);
}
