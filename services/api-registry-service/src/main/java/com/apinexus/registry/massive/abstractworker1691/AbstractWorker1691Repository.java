package com.apinexus.registry.massive.abstractworker1691;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractWorker1691Repository extends JpaRepository<AbstractWorker1691, Long> {
    AbstractWorker1691 findByName(String name);
}
