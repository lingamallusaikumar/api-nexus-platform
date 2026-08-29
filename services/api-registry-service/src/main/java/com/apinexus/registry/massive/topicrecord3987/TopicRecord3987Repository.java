package com.apinexus.registry.massive.topicrecord3987;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRecord3987Repository extends JpaRepository<TopicRecord3987, Long> {
    TopicRecord3987 findByName(String name);
}
