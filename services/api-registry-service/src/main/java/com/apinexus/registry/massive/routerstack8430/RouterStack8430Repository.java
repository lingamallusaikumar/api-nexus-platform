package com.apinexus.registry.massive.routerstack8430;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterStack8430Repository extends JpaRepository<RouterStack8430, Long> {
    RouterStack8430 findByName(String name);
}
