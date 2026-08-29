package com.apinexus.registry.massive.topicbridge1982;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicBridge1982Repository extends JpaRepository<TopicBridge1982, Long> {
    TopicBridge1982 findByName(String name);
}
