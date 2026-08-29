package com.apinexus.registry.massive.virtualagent6783;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualAgent6783Repository extends JpaRepository<VirtualAgent6783, Long> {
    VirtualAgent6783 findByName(String name);
}
