package com.apinexus.registry.massive.topicflow1372;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicFlow1372Repository extends JpaRepository<TopicFlow1372, Long> {
    TopicFlow1372 findByName(String name);
}
