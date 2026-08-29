package com.apinexus.registry.massive.zonelog5963;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneLog5963Repository extends JpaRepository<ZoneLog5963, Long> {
    ZoneLog5963 findByName(String name);
}
