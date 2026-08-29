package com.apinexus.registry.massive.dataworker4763;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataWorker4763Repository extends JpaRepository<DataWorker4763, Long> {
    DataWorker4763 findByName(String name);
}
