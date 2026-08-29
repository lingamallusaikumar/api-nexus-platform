package com.apinexus.registry.massive.openworker1041;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenWorker1041Repository extends JpaRepository<OpenWorker1041, Long> {
    OpenWorker1041 findByName(String name);
}
