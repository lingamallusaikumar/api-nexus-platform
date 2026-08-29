package com.apinexus.registry.massive.streamlink9344;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamLink9344Repository extends JpaRepository<StreamLink9344, Long> {
    StreamLink9344 findByName(String name);
}
