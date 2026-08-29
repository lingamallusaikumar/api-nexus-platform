package com.apinexus.registry.massive.cloudcomponent6991;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudComponent6991Repository extends JpaRepository<CloudComponent6991, Long> {
    CloudComponent6991 findByName(String name);
}
