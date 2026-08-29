package com.apinexus.registry.massive.onlinedatabase2302;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineDatabase2302Repository extends JpaRepository<OnlineDatabase2302, Long> {
    OnlineDatabase2302 findByName(String name);
}
