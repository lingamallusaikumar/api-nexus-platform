package com.apinexus.registry.massive.dynamicprocessor7840;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicProcessor7840Repository extends JpaRepository<DynamicProcessor7840, Long> {
    DynamicProcessor7840 findByName(String name);
}
