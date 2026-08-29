package com.apinexus.registry.massive.messageflow4051;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageFlow4051Repository extends JpaRepository<MessageFlow4051, Long> {
    MessageFlow4051 findByName(String name);
}
