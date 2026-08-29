package com.apinexus.registry.massive.topicbridge891;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicBridge891Repository extends JpaRepository<TopicBridge891, Long> {
    TopicBridge891 findByName(String name);
}
