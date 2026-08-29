package com.apinexus.registry.massive.topicpath8673;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicPath8673Repository extends JpaRepository<TopicPath8673, Long> {
    TopicPath8673 findByName(String name);
}
