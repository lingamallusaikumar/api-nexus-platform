package com.apinexus.registry.massive.staticbuffer8090;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticBuffer8090Repository extends JpaRepository<StaticBuffer8090, Long> {
    StaticBuffer8090 findByName(String name);
}
