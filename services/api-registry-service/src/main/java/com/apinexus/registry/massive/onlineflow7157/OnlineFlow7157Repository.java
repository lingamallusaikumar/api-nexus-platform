package com.apinexus.registry.massive.onlineflow7157;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineFlow7157Repository extends JpaRepository<OnlineFlow7157, Long> {
    OnlineFlow7157 findByName(String name);
}
