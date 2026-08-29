package com.apinexus.registry.massive.hybriddispatcher1824;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridDispatcher1824Repository extends JpaRepository<HybridDispatcher1824, Long> {
    HybridDispatcher1824 findByName(String name);
}
