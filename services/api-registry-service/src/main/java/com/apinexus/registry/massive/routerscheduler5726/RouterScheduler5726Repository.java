package com.apinexus.registry.massive.routerscheduler5726;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterScheduler5726Repository extends JpaRepository<RouterScheduler5726, Long> {
    RouterScheduler5726 findByName(String name);
}
