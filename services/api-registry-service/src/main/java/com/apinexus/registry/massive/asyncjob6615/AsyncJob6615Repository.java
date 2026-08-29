package com.apinexus.registry.massive.asyncjob6615;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncJob6615Repository extends JpaRepository<AsyncJob6615, Long> {
    AsyncJob6615 findByName(String name);
}
