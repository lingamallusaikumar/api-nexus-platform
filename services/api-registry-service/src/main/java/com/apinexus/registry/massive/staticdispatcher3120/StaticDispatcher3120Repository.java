package com.apinexus.registry.massive.staticdispatcher3120;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticDispatcher3120Repository extends JpaRepository<StaticDispatcher3120, Long> {
    StaticDispatcher3120 findByName(String name);
}
