package com.apinexus.registry.massive.cloudlink7703;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudLink7703Repository extends JpaRepository<CloudLink7703, Long> {
    CloudLink7703 findByName(String name);
}
