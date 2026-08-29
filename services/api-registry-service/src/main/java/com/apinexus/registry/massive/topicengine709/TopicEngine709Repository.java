package com.apinexus.registry.massive.topicengine709;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicEngine709Repository extends JpaRepository<TopicEngine709, Long> {
    TopicEngine709 findByName(String name);
}
