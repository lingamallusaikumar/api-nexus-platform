package com.apinexus.registry.massive.hubjob2192;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubJob2192Repository extends JpaRepository<HubJob2192, Long> {
    HubJob2192 findByName(String name);
}
