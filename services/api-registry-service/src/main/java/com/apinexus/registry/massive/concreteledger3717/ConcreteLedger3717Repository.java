package com.apinexus.registry.massive.concreteledger3717;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteLedger3717Repository extends JpaRepository<ConcreteLedger3717, Long> {
    ConcreteLedger3717 findByName(String name);
}
