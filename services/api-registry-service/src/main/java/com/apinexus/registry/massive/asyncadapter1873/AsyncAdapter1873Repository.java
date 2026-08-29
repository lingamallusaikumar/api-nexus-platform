package com.apinexus.registry.massive.asyncadapter1873;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncAdapter1873Repository extends JpaRepository<AsyncAdapter1873, Long> {
    AsyncAdapter1873 findByName(String name);
}
