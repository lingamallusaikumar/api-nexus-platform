package com.apinexus.registry.massive.onlinelist1610;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineList1610Repository extends JpaRepository<OnlineList1610, Long> {
    OnlineList1610 findByName(String name);
}
