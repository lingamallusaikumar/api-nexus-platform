package com.apinexus.registry.massive.topicmodule5535;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicModule5535Repository extends JpaRepository<TopicModule5535, Long> {
    TopicModule5535 findByName(String name);
}
