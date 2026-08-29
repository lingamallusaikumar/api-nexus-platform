package com.apinexus.registry.massive.virtuallist1709;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualList1709Repository extends JpaRepository<VirtualList1709, Long> {
    VirtualList1709 findByName(String name);
}
