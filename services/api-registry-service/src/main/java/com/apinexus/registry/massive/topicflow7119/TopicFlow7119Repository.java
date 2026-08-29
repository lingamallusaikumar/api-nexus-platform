package com.apinexus.registry.massive.topicflow7119;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicFlow7119Repository extends JpaRepository<TopicFlow7119, Long> {
    TopicFlow7119 findByName(String name);
}
