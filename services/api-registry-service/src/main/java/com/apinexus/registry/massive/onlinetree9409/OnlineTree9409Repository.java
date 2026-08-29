package com.apinexus.registry.massive.onlinetree9409;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineTree9409Repository extends JpaRepository<OnlineTree9409, Long> {
    OnlineTree9409 findByName(String name);
}
