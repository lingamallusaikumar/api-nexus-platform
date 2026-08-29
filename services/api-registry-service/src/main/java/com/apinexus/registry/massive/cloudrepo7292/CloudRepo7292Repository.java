package com.apinexus.registry.massive.cloudrepo7292;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudRepo7292Repository extends JpaRepository<CloudRepo7292, Long> {
    CloudRepo7292 findByName(String name);
}
