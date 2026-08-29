package com.apinexus.registry.massive.topicworker7970;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicWorker7970Repository extends JpaRepository<TopicWorker7970, Long> {
    TopicWorker7970 findByName(String name);
}
