package com.apinexus.registry.massive.closedpool3391;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedPool3391Repository extends JpaRepository<ClosedPool3391, Long> {
    ClosedPool3391 findByName(String name);
}
