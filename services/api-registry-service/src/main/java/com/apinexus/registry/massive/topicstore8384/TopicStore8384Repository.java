package com.apinexus.registry.massive.topicstore8384;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicStore8384Repository extends JpaRepository<TopicStore8384, Long> {
    TopicStore8384 findByName(String name);
}
