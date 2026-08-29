package com.apinexus.registry.massive.onlinelog4802;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineLog4802Repository extends JpaRepository<OnlineLog4802, Long> {
    OnlineLog4802 findByName(String name);
}
