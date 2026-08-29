package com.apinexus.registry.massive.closedprocess674;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedProcess674Repository extends JpaRepository<ClosedProcess674, Long> {
    ClosedProcess674 findByName(String name);
}
