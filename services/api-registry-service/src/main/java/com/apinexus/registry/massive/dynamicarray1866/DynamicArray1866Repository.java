package com.apinexus.registry.massive.dynamicarray1866;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicArray1866Repository extends JpaRepository<DynamicArray1866, Long> {
    DynamicArray1866 findByName(String name);
}
