package com.apinexus.registry.massive.onlinelink4838;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineLink4838Repository extends JpaRepository<OnlineLink4838, Long> {
    OnlineLink4838 findByName(String name);
}
