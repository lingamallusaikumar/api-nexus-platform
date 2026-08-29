package com.apinexus.registry.massive.globalengine3188;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalEngine3188Repository extends JpaRepository<GlobalEngine3188, Long> {
    GlobalEngine3188 findByName(String name);
}
