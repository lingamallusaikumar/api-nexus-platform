package com.apinexus.registry.massive.switchedge9766;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchEdge9766Repository extends JpaRepository<SwitchEdge9766, Long> {
    SwitchEdge9766 findByName(String name);
}
