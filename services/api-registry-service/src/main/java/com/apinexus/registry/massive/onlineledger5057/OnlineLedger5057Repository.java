package com.apinexus.registry.massive.onlineledger5057;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineLedger5057Repository extends JpaRepository<OnlineLedger5057, Long> {
    OnlineLedger5057 findByName(String name);
}
