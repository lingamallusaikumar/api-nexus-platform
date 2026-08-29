package com.apinexus.registry.massive.streamlink767;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamLink767Repository extends JpaRepository<StreamLink767, Long> {
    StreamLink767 findByName(String name);
}
