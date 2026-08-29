package com.apinexus.registry.massive.topicmap5150;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicMap5150Repository extends JpaRepository<TopicMap5150, Long> {
    TopicMap5150 findByName(String name);
}
