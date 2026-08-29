package com.apinexus.registry.massive.zonedispatcher2950;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneDispatcher2950Repository extends JpaRepository<ZoneDispatcher2950, Long> {
    ZoneDispatcher2950 findByName(String name);
}
