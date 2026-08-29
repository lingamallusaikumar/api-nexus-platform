package com.apinexus.registry.massive.routerdispatcher625;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterDispatcher625Repository extends JpaRepository<RouterDispatcher625, Long> {
    RouterDispatcher625 findByName(String name);
}
