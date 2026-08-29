package com.apinexus.registry.massive.onlinemodule289;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineModule289Repository extends JpaRepository<OnlineModule289, Long> {
    OnlineModule289 findByName(String name);
}
