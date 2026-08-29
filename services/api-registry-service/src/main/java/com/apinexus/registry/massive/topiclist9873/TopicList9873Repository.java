package com.apinexus.registry.massive.topiclist9873;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicList9873Repository extends JpaRepository<TopicList9873, Long> {
    TopicList9873 findByName(String name);
}
