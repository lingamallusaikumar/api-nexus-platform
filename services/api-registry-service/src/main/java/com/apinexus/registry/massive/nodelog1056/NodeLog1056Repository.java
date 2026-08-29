package com.apinexus.registry.massive.nodelog1056;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeLog1056Repository extends JpaRepository<NodeLog1056, Long> {
    NodeLog1056 findByName(String name);
}
