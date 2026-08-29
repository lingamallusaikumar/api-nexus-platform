package com.apinexus.registry.massive.closeddatabase3543;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedDatabase3543Repository extends JpaRepository<ClosedDatabase3543, Long> {
    ClosedDatabase3543 findByName(String name);
}
