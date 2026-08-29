package com.apinexus.registry.massive.topicmanager1936;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicManager1936Repository extends JpaRepository<TopicManager1936, Long> {
    TopicManager1936 findByName(String name);
}
