package com.apinexus.registry.massive.onlinevertex7378;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineVertex7378Repository extends JpaRepository<OnlineVertex7378, Long> {
    OnlineVertex7378 findByName(String name);
}
