package com.apinexus.registry.massive.messagevertex827;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageVertex827Repository extends JpaRepository<MessageVertex827, Long> {
    MessageVertex827 findByName(String name);
}
