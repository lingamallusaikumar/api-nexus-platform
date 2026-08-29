package com.apinexus.registry.massive.meshscheduler6945;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshScheduler6945Repository extends JpaRepository<MeshScheduler6945, Long> {
    MeshScheduler6945 findByName(String name);
}
