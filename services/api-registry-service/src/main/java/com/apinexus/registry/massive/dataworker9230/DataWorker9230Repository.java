package com.apinexus.registry.massive.dataworker9230;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataWorker9230Repository extends JpaRepository<DataWorker9230, Long> {
    DataWorker9230 findByName(String name);
}
