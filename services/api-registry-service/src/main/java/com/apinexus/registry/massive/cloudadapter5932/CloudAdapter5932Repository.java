package com.apinexus.registry.massive.cloudadapter5932;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudAdapter5932Repository extends JpaRepository<CloudAdapter5932, Long> {
    CloudAdapter5932 findByName(String name);
}
