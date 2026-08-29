package com.apinexus.registry.massive.messagegraph4351;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageGraph4351Repository extends JpaRepository<MessageGraph4351, Long> {
    MessageGraph4351 findByName(String name);
}
