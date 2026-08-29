package com.apinexus.registry.massive.networkroute8104;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkRoute8104Repository extends JpaRepository<NetworkRoute8104, Long> {
    NetworkRoute8104 findByName(String name);
}
