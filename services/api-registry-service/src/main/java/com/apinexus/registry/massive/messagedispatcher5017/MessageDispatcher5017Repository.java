package com.apinexus.registry.massive.messagedispatcher5017;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDispatcher5017Repository extends JpaRepository<MessageDispatcher5017, Long> {
    MessageDispatcher5017 findByName(String name);
}
