package com.apinexus.registry.massive.topicmodule9981;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicModule9981Repository extends JpaRepository<TopicModule9981, Long> {
    TopicModule9981 findByName(String name);
}
