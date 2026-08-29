package com.apinexus.registry.massive.cloudadapter5382;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudAdapter5382Repository extends JpaRepository<CloudAdapter5382, Long> {
    CloudAdapter5382 findByName(String name);
}
