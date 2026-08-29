package com.apinexus.registry.massive.hubjob9339;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubJob9339Repository extends JpaRepository<HubJob9339, Long> {
    HubJob9339 findByName(String name);
}
